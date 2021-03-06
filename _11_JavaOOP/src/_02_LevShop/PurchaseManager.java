package _02_LevShop;

import java.util.Date;

public class PurchaseManager {
	public static void processPurchase(Customer customer, Product product) throws AgeRestrictionException, NotEnoughMoneyException, OutOfStockException, ExpirationException {
		if (!isInStock(product)) {
			throw new OutOfStockException("Product is Out of Stock");
		}
		
		if (isExpired(product)) {
			throw new ExpirationException("Product is Expired");
		}
		
		if (!hasEnoughMoney(product, customer)) {
			throw new NotEnoughMoneyException("Customer doesn't have enough money");
		}
		
		if (!isWithingAgeRestict(product, customer)) {
			throw new AgeRestrictionException("Customer isn't withing age group");
		}
		
		product.quantity--;
		customer.setBalance(customer.getBalance() - product.getPrice());
	}
	
	private static boolean isInStock(Product product) {
		if (product.quantity > 0) {
			return true;
		}
		
		return false;
	}
	
	private static boolean isExpired(Product product) {
		if (!(product instanceof FoodProduct)) {
			return false;
		}
		
		Date current = new Date();
		Date exp = ((FoodProduct)product).getExpirationDate();
		if (current.compareTo(exp) > 0) {
			return true;
		}
		
		return false;
	}
	
	private static boolean hasEnoughMoney(Product product, Customer customer) {
		if (customer.getBalance() >= product.getPrice()) {
			return true;
		}
		
		return false;
	}
	
	private static boolean isWithingAgeRestict(Product product, Customer customer) {
		switch (product.ageRestrict) {
		case NONE: return true;
		case ADAULT: 
			if (customer.getAge() < 18) {
				return false;
			} else {
				return true;
			}
		case TEEN: 
			if (customer.getAge() < 13) {
				return false;
			} else {
				return true;
			}
			
		default: return false;
		}
	}
}

package _02_LevShop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import _01_Geometry.PerimeterMeasurable;
import _01_Geometry.Shape;

public class Tester {
	
	public static void main(String[] args) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse("22/10/2014");
		Date date2 = formatter.parse("25/10/2014");
		Date date3 = formatter.parse("27/10/2014");
		Date date4 = formatter.parse("28/10/2014");
		
		FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.ADAULT, date4);
		FoodProduct teddy = new FoodProduct("Teddy Bear", 1.90, 1, AgeRestriction.NONE, date3);
		FoodProduct banichka = new FoodProduct("420 Banica", 4.3, 200, AgeRestriction.TEEN, date2);
		FoodProduct bozichka = new FoodProduct("Bozichka", 3.40, 5, AgeRestriction.ADAULT, date);
		Computer asus = new Computer("Asus", 450.0, 300, AgeRestriction.ADAULT);
		Appliance pechka = new Appliance("Bat georgii 2000", 1000.0, 10, AgeRestriction.ADAULT);
		
		Customer pecata = new Customer("Pecata", 17, 30.00);
		Customer gopeto = new Customer("Gopeto", 18, 0.44);
		
		try {
			PurchaseManager.processPurchase(pecata, cigars);
		} catch (AgeRestrictionException e) {
			System.out.println("You are too young to buy this product!");
		} catch (Exception e) {
			System.out.println("Other");
		}
		
		try {
			PurchaseManager.processPurchase(gopeto, cigars);
		} catch (NotEnoughMoneyException e) {
			System.out.println("You do not have enough money to buy this product!");
		} catch (Exception e) {
			System.out.println("Other");
		}
		
		try {
			System.out.println(pecata.getBalance());
			PurchaseManager.processPurchase(pecata, teddy);
			System.out.println("Success");
			System.out.println(pecata.getBalance());
		} catch (OutOfStockException e) {
			System.out.println("Product is not in stock!");
		} catch (Exception e) {
			System.out.println("Other");
		}
		
		List<Product> pokupki = new ArrayList<Product>();
		pokupki.add(cigars);
		pokupki.add(teddy);
		pokupki.add(banichka);
		pokupki.add(bozichka);
		pokupki.add(asus);
		pokupki.add(pechka);
		
		pokupki.stream().forEach(e -> System.out.println(e.getName() + " | " + e.getPrice() + " | " + e.getAgeRestrict()));
		System.out.println("\n\n");
		
		Comparator<Product> ExpirationDateCmp = (f1, f2) -> {
			FoodProduct S1 = (FoodProduct) f1;
			FoodProduct S2= (FoodProduct) f2;
			
			return S1.getExpirationDate().compareTo(S2.getExpirationDate());		
		};
		
		System.out.println(
				pokupki.stream()
				    .filter(e -> e instanceof FoodProduct)
				    .sorted(ExpirationDateCmp)
				    .map(e -> e.name)
				    .findFirst()
				);
		pokupki.stream()
	    .filter(e -> e instanceof FoodProduct)
	    .sorted(ExpirationDateCmp)
	    .forEach(e -> System.out.println(e.getName()));
		
		System.out.println("\n\n");
		
		Comparator<Product> PriceCmp = (f1, f2) -> {
			return f1.getPrice() < f2.getPrice() ? -1 :
				f1.getPrice() > f2.getPrice() ? 1 : 0;		
		};
		
		pokupki.stream()
	    .filter(e -> e.ageRestrict == AgeRestriction.ADAULT)
	    .sorted(PriceCmp)
	    .forEach(e -> System.out.println(e.getName()));
	}
}

package _02_LevShop;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product implements Expirable {
	private Date expiration;
	
	public FoodProduct(String name, double price, int quantity,
			AgeRestriction ageRestrict, Date expiration) {
		super(name, price, quantity, ageRestrict);
		this.setExpirationDate(expiration);
	}
	
	@Override
	public Date getExpirationDate() {
		return this.expiration;
	}

	public void setExpirationDate(Date d1) {
		this.expiration = d1;
	}
	
	@Override
	public double getPrice() {
		if (isExpired()) {
			return (super.getPrice()*0.7);
		}
		
		return super.getPrice();
	}
	
	public boolean isExpired() {
		Date current = new Date();
		long diff = this.expiration.getTime() - current.getTime();
	    double days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	    
		if (days <= 15) {
			return true;
		} else {
			return false;
		}
	}
}

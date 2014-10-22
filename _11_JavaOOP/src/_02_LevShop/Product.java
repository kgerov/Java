package _02_LevShop;

public abstract class Product implements Buyable{
	protected String name;
	protected double price;
	protected int quantity;
	protected AgeRestriction ageRestrict;
	
	public Product(String name, double price, int quantity,
			AgeRestriction ageRestrict) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.ageRestrict = ageRestrict;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AgeRestriction getAgeRestrict() {
		return ageRestrict;
	}

	public void setAgeRestrict(AgeRestriction ageRestrict) {
		this.ageRestrict = ageRestrict;
	}
	
}

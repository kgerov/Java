package _02_LevShop;

public abstract class ElectronicProduct extends Product implements Returnable{
	protected int guaranteePeriod;

	public ElectronicProduct(String name, double price, int quantity,
			AgeRestriction ageRestrict) {
		super(name, price, quantity, ageRestrict);
	}

	public int getGuaranteePeriod() {
		return guaranteePeriod;
	}

	public void setGuaranteePeriod(int guaranteePeriod) {
		this.guaranteePeriod = guaranteePeriod;
	}

	@Override
	public abstract double getReturnMoney();
}

package _02_LevShop;

public class Appliance extends ElectronicProduct{
	private final int guaranteePeriod = 6;
	
	public Appliance(String name, double price, int quantity,
			AgeRestriction ageRestrict) {
		super(name, price, quantity, ageRestrict);
	}

	@Override
	public double getReturnMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
}

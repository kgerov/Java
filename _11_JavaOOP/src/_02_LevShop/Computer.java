package _02_LevShop;

public class Computer extends ElectronicProduct{
	private final int guaranteePeriod = 24;
	
	public Computer(String name, double price, int quantity,
			AgeRestriction ageRestrict) {
		super(name, price, quantity, ageRestrict);
	}
	
	@Override
	public double getReturnMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
}

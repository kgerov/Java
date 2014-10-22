package _02_LevShop;

import java.util.List;

public class Customer {
	private String name;
	private int age;
	private double balance;
	private List<Product> products;
	
	public Customer(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

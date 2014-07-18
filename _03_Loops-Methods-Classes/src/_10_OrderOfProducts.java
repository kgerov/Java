import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;

public class  _10_OrderOfProducts {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		ArrayList<Product> Orders = new ArrayList<Product>();
		Orders = readFile(Orders, "D:/Eclipse Workspace/_03_Loops-Methods-Classes/Orders.txt");
		ArrayList<Product> Prod = new ArrayList<Product>();
		Prod = readFile(Prod, "D:/Eclipse Workspace/_03_Loops-Methods-Classes/Products.txt");
		
		double finalPrice = 0;
		for (Product x : Orders) {
			for (Product y : Prod) {
				if (x.getName().equals(y.getName())) {
					finalPrice += x.getPrice()*y.getPrice();
				}
			}
		}
		System.out.println(finalPrice);
	}

	private static ArrayList<Product> readFile(ArrayList<Product> myList, String link) {
		try (BufferedReader reader = new BufferedReader(new FileReader(link));)
			{
			String line = null;
			while ((line = reader.readLine()) != null) {
				String name = getName(line);
				double price = getPrice(line);
				Product sample  = new Product(price, name);
				myList.add(sample);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		ArrayList<Product> sortedList = new ArrayList<Product>();
		int iterations = myList.size();
		for (int i = 0; i < iterations; i++) {
			double minPrice = myList.get(0).getPrice();
			int t = 0;
			for (Product x : myList) {
				if (x.getPrice() < minPrice) {
					minPrice = x.getPrice();
				}
			}
			for (Product x : myList) {
				if (x.getPrice() == minPrice) {
					sortedList.add(x);
					t = myList.indexOf(x);
				}
			}
			myList.remove(t);
		}
		return sortedList;
	}

	private static double getPrice(String line) {
		double price = 0;
		char currChar = 'p';
		String iPrice = "";
		for (int i = 0; i < line.length(); i++) {
			currChar = line.charAt(i);
			if (currChar > 45 && currChar < 58) {
				iPrice += currChar;
			}
		}
		price = Double.parseDouble(iPrice);
		return price;
	}

	private static String getName(String line) {
		String product = "";
		char currChar = 'q';
		
		for (int i = 0; i < line.length(); i++) {
			currChar = line.charAt(i);
			if (currChar > 64) {
				product += currChar;
			}
		}
		return product;
	}
}

	class Product {
		private double price;
		private String name;
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Product(double price, String name) {
			this.price = price;
			this.name = name;
		}
	}
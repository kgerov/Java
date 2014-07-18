import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;

public class _09_ListOfProducts {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		ArrayList<Products> myList = new ArrayList<Products>();
		try (BufferedReader reader = new BufferedReader(new FileReader("D:/Eclipse Workspace/_03_Loops-Methods-Classes/input.txt"));)
			{
			String line = null;
			while ((line = reader.readLine()) != null) {
				String name = getName(line);
				double price = getPrice(line);
				Products sample  = new Products(price, name);
				myList.add(sample);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		ArrayList<Products> sortedList = new ArrayList<Products>();
		int iterations = myList.size();
		for (int i = 0; i < iterations; i++) {
			double minPrice = myList.get(0).getPrice();
			int t = 0;
			for (Products x : myList) {
				if (x.getPrice() < minPrice) {
					minPrice = x.getPrice();
				}
			}
			for (Products x : myList) {
				if (x.getPrice() == minPrice) {
					sortedList.add(x);
					t = myList.indexOf(x);
				}
			}
			myList.remove(t);
		}
		
		for (Products x : sortedList) {
			System.out.printf("%.2f %s",x.getPrice(), x.getName());
			System.out.println();
		}
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
		int i = 0;
		while (currChar != ' ') {
			currChar = line.charAt(i);
			product += currChar;
			i++;
		}
		return product;
	}
}

	class Products {
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
		public Products(double price, String name) {
			this.price = price;
			this.name = name;
		}
	}
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _11_Excel {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.ROOT);
		ArrayList<Office> ion = new ArrayList<Office>(); //Ion - sample firm
		
		File inputWorkbook = new File("D:/Eclipse Workspace/3. Incomes-Report.xls");
		Workbook w;
		 try {
		      w = Workbook.getWorkbook(inputWorkbook);
		      Sheet sheet = w.getSheet(0);
		      
		      for (int i = 1; i < sheet.getRows(); i++) {
				Cell cellOffice = sheet.getCell(0,i);
				Cell cellInc = sheet.getCell(5, i);
				String company = cellOffice.getContents();
				double inc = Double.parseDouble(cellInc.getContents());
				
				Office temp = new Office(inc, company);
				ion.add(temp);
			}
		    } catch (BiffException e) {
		      e.printStackTrace();
		      System.out.println("Error");
		    }
		 Collections.sort(ion, new Comparator<Office>() {
		    public int compare(Office v1, Office v2) {
		        return v1.getName().compareTo(v2.getName());
		    }
		 });
		 
		 for (int i = 0; i < ion.size() - 1; i++) {
			boolean flag = false;
			if (ion.get(i).getName().equals(ion.get(i+1).getName())) {
				double newPrice = ion.get(i).getPrice() + ion.get(i+1).getPrice();
				ion.get(i).setPrice(newPrice);
				flag = true;
			}
			
			if (flag) {
				ion.remove(i+1);
				i--;
			}
		}
		 
		 for (Office x : ion) {
			 System.out.printf("%s Total -> %.2f", x.getName(), x.getPrice());
			 System.out.println();
		}
		 double grandSum = 0;
		 for (Office x : ion) {
			grandSum += x.getPrice();
		}
		 System.out.println("Grand Total -> " + grandSum);
	}
}

class Office {
	private double income;
	private String name;
	
	public double getPrice() {
		return income;
	}
	public void setPrice(double income) {
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Office(double income, String name) {
		this.income = income;
		this.name = name;
	}
}

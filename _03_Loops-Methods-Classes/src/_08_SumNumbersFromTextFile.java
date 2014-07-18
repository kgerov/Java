import java.io.BufferedReader;
import java.io.FileReader;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		int sum = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader("D:/Eclipse Workspace/_03_Loops-Methods-Classes/input.txt"));)
			{
			String line = null;
			while ((line = reader.readLine()) != null) {
				sum += Integer.parseInt(line);
			}
			System.out.println(sum);
			
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

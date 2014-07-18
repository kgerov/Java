package emmit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class emmit {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		for (int i = 0; i < 60; i++) {
			writer.println("<div>");
		}
		
		for (int i = 0; i < 60; i++) {
			writer.println("</div>");
		}

		writer.close();
	}

}

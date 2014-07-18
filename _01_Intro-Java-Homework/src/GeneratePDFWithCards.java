import java.io.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;

public class GeneratePDFWithCards { 
	
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 30,
		      Font.BOLD, BaseColor.BLACK);
	private static Font BFred = FontFactory.getFont("C:/Windows/Fonts/Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 26);
	private static Font BFblack = FontFactory.getFont("C:/Windows/Fonts/Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 26);
	
	public static void main(String arg[]) throws Exception { 
		Document document=new Document();
		PdfWriter.getInstance(document,new FileOutputStream("Deck.pdf"));
		document.open(); 
				
		document.add(new Paragraph("Deck Of Cards", catFont));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		BFred.setColor(BaseColor.RED);
		
		String[] symb = {"J", "Q", "K", "A"};
		
		for(int i = 2; i < 11; i++) { 
			addCard(document, "♠", Integer.toString(i), BFblack);
			addCard(document, "♣", Integer.toString(i), BFblack);
			addCard(document, "♥", Integer.toString(i), BFred);
			addCard(document, "♦", Integer.toString(i), BFred);	
			document.newPage();
		}
		
		for(int i = 0; i < 4; i++) { 
			addCard(document, "♠", symb[i], BFblack);
			addCard(document, "♣", symb[i], BFblack);
			addCard(document, "♥", symb[i], BFred);
			addCard(document, "♦", symb[i], BFred);
			document.newPage();
		}
		addCard(document, "", "♠", BFred);
		
		document.close(); 
	}
	
	private static void addCard(Document document, String Symb, String Numb, Font f) throws DocumentException {
		
		PdfPTable card = new PdfPTable(1);
		card.setWidthPercentage(13);
		PdfPCell c1 = new PdfPCell(new Phrase((Numb + Symb), f));
	    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	    c1.setBorderWidth(2);
	    c1.setPadding(10);
	    c1.setBackgroundColor(BaseColor.ORANGE);
	    c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    c1.setFixedHeight(90);
	    card.addCell(c1);
	    document.add(card);
	    document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
	}
}
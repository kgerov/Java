import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class _z10_PaintAHouseAsSVG {


	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.ROOT);
		DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
		Document document = domImpl.createDocument(null, "svg", null);
		SVGGraphics2D svg = new SVGGraphics2D(document);
		svg.drawLine(100, 200, 300, 140);
		svg.stream(new FileWriter("house.html"), false);
	}
}
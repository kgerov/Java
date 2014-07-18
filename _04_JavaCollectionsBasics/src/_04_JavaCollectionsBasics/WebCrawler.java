package _04_JavaCollectionsBasics;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class WebCrawler {

	public static void main(String[] args) {
		URL startUrl;
		try {
			startUrl = new URL("http://stackoverflow.com/");
			nextUrl(startUrl);
		} catch (MalformedURLException e) {
			System.out.println("error");
		}
		
	}

	private static void nextUrl(URL nextUrl) {
		URL url;
	    InputStream is = null;
	    DataInputStream dis;
	    String line;
	    String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
	    
	    try {
	        url = nextUrl;
	        is = url.openStream(); 
	        dis = new DataInputStream(new BufferedInputStream(is));

	        while ((line = dis.readLine()) != null) {
	            //System.out.println(line);
	        	for (int i = 0; i < line.length(); i++) {
	        		String desiredUrl = "";
	        		HashSet<URL> stack = new HashSet<>();
					if (line.contains("href")) {
						int urlPosition = line.indexOf("href");
						urlPosition +=6;
						int p = urlPosition;
						try {
							while (line.charAt(p)!='"') {
								desiredUrl += line.charAt(p);
								p++;
							}
							//System.out.println(desiredUrl);
							if (desiredUrl.matches(regex)) {
				        		URL nextU = new URL(desiredUrl);
				        		if (!stack.contains(nextU)) {
				        			stack.add(nextU);
				        		}
							}
							for (URL url2 : stack) {
								System.out.println(url2);
							}
							
						}
						catch (StringIndexOutOfBoundsException e) {
							
						}
					}
				}
	        }
	    } catch (MalformedURLException mue) {
	         mue.printStackTrace();
	    } catch (IOException ioe) {
	         ioe.printStackTrace();
	    } finally {
	        try {
	            is.close();
	        } catch (IOException ioe) {
	        	
	        }
	    }
	}

}


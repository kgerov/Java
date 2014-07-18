package _04_JavaCollectionsBasics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _12_CardFrequency {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = inp.nextLine();
		String[] words = text.split("\\W");
		TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
		
		double length = 0;
		for (String word : words) {
			if (word.equals("")) {
				continue;
			}
			else {
			  Integer count = wordCount.get(word);
			  if (count == null) {
			    count = 0; 
			  }
			  wordCount.put(word, count+1);
			  length++;
			}
		}
		
		for (int j = 0; j < words.length; j++) {
			for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
				  Integer value = entry.getValue();
				  String key = entry.getKey();
				  
				  if (key.equals(words[j])) {
					  System.out.printf(key + " -> %.2f", value/length*100);
					  System.out.println("%");
					  wordCount.remove(key);
					  break;
				  }
			}
		}
	}

}

package _04_JavaCollectionsBasics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = inp.nextLine();
		text = text.toLowerCase();
		String[] words = text.split("\\W");
		TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
		
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
			}
		}
		
		int maxCount = 0;
		for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
			  Integer value = entry.getValue();
			  if (value > maxCount) {
				maxCount = value;
			}
		}
		
		for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
			  Integer value = entry.getValue();
			  String key = entry.getKey();
			  if (value == maxCount) {
				  System.out.println(key + " -> " + value);
			}
		}
	}

}

package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _07_CountSubstrings{

     public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = inp.nextLine();
        System.out.print("Input word: ");
        String word = inp.nextLine();
        text = text.toLowerCase();
        word = word.toLowerCase();
        
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == word.charAt(0)) {
            	try {
            		 boolean contain = true;
                     for(int j = 1, p = i+1; j < word.length(); j++, p++) {
                         if(text.charAt(p) != word.charAt(j)) {
                             contain = false;
                         }
                     }
                     if(contain) {
                         counter++;
                     }
				} catch (IndexOutOfBoundsException e) {
				} 
            }
        }
        
        System.out.println("Repeated: " + counter);
     }
}
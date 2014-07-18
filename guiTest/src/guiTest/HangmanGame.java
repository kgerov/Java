package guiTest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Runtime;


public class HangmanGame {
		
	public static Map<String, String> getDictionary(int category) {
		//Open the file and inputs text into a Map
		Map dictionary = new HashMap();
		String link ="";
		switch(category){
		case 1: link = "FamousPeople.txt";
				break;
		case 2: link = "Companies.txt";
				break;
		case 3: link = "Animals.txt";
				break;
		case 4: link = "Countries.txt";
				break;
		case 5: link = "Foods.txt";
				break;
		
		}
		File file = new File(link);
	    
	    try {
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	            String word = sc.nextLine();
	            String hint = sc.nextLine();
	            dictionary.put(word, hint);
	            word = sc.nextLine();
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }

		return dictionary;
	}
	
	public static String[] getWords (int categoryNum){
		//Gets a random word from the Map
		Map dictionary = getDictionary(categoryNum);
		String[] pairWords = new String[2];
		Random random = new Random();
		List<String> keys = new ArrayList<String>(dictionary.keySet());
		pairWords[0] = keys.get(random.nextInt(keys.size()));
		pairWords[1] = (String)dictionary.get(pairWords[0]);
		pairWords[0] = pairWords[0].toUpperCase();
		pairWords[1] = pairWords[1].toUpperCase();
		return pairWords;
	}
	
	public static String createHiddenWord(String guessWord){
		char[] guessWordChar = guessWord.toCharArray();
		char[] hiddenWord = new char[guessWordChar.length];
		for (int currentChar = 0; currentChar < guessWordChar.length; currentChar++) {
			if (guessWordChar[currentChar] == ' ')
				hiddenWord[currentChar] = ' ';
			else
				hiddenWord[currentChar] = '\u2014';
		}
		return String.valueOf(hiddenWord);
	}
	
	public static boolean checkChar(char currentChar,String guessWord){
		boolean flag = false;
		char[] guessWordChar = guessWord.toCharArray();
		for (int i = 0; i < guessWordChar.length; i++) {
			if (currentChar == guessWordChar[i]){
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static String updateHiddenWord(char currentChar, String hiddenWord, String guessWord){
		char[] hiddenWordChar = hiddenWord.toCharArray();
		char[] guessWordChar = guessWord.toCharArray();
		for (int i = 0; i < guessWordChar.length; i++) {
			if (currentChar == guessWordChar[i])
				hiddenWordChar[i] = currentChar;
		}
		hiddenWord = String.valueOf(hiddenWordChar);
		return hiddenWord;
	}
	
	public static int getLives(int difficultyNum){
		int lives = 0;
		switch (difficultyNum) {
		case 1: lives = 0;
				break;
		case 2: lives = 3;
				break;
		case 3: lives = 5;
				break;
		default:
			break;
		}
		return lives;
	}
}
	
		
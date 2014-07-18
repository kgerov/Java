import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;


public class _06_RandomHandsOfCards {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String[] deck = new String [52];
		deck = fillDeck(deck);
		System.out.print("Enter number of hands: ");
		int n = inp.nextInt();
		printRandomHands(deck, n);		
	}

	private static void printRandomHands(String[] deck, int n) {
		Integer[] arr = new Integer[52]; 
		for (int i = 0; i < arr.length; i++) { 
		    arr[i] = i; 
		} 
		Collections.shuffle(Arrays.asList(arr)); 
		//Random ran = new Random();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
			//int x = ran.nextInt(52);
			int x = arr[count];
			System.out.print(deck[x] + " ");
			count++;
			}
		System.out.println();
		}
		
	}

	private static String[] fillDeck(String[] deck) {
		int j = 0;
		for (int i = 2; i <= 10; i++) {
			String num = Integer.toString(i);
			deck = addCard(num, "♣", j, deck); j++;
			deck = addCard(num, "♦", j, deck); j++;
			deck = addCard(num, "♠", j, deck); j++;
			deck = addCard(num, "♥", j, deck); j++;
		}
		
		String[] sym = new String [4];
		sym[0] = "J"; sym[1] = "Q"; sym[2] = "K"; sym[3] = "A"; 
		
		for (int i = 0; i < 4; i++) {
			deck = addCard(sym[i], "♣", j, deck); j++;
			deck = addCard(sym[i], "♦", j, deck); j++;
			deck = addCard(sym[i], "♠", j, deck); j++;
			deck = addCard(sym[i], "♥", j, deck); j++;
		}
		
		return deck;
	}

	private static String[] addCard(String num, String string, int j, String[] deck) {
		deck[j] = (num + string).toString();
		return deck;
	}

}

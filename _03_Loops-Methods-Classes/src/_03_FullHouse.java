
public class _03_FullHouse {

	public static void main(String[] args) {
		int counter = 0;
		for (int first = 2; first < 15; first++) {
			for (int second = 2; second < 15; second++) {
				if (first == second) {
					continue;
				}
				for (int fSuit = 0; fSuit < 4; fSuit++) {
					for (int sSuit = fSuit + 1; sSuit < 4; sSuit++) {
						for (int tSuit = sSuit + 1; tSuit < 4; tSuit++) {
							for (int foSuit = 0; foSuit < 4; foSuit++) {
								for (int fiSuit = foSuit + 1; fiSuit < 4; fiSuit++) {
									printCard(first);
									printSuit(fSuit);
									printCard(first);
									printSuit(sSuit);
									printCard(first);
									printSuit(tSuit);
									printCard(second);
									printSuit(foSuit);
									printCard(second);
									printSuit(fiSuit);
									counter++;
									System.out.println();
								}
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
	
	private static void printCard(int n) {
		if (n < 11) {
			System.out.print(n);
		}
		else {
			switch (n) {
			case 11: System.out.print("J");
				break;
			case 12: System.out.print("Q");
				break;
			case 13: System.out.print("K");
				break;
			case 14: System.out.print("A");
				break;
			}
		}
	}
	
	private static void printSuit(int n) {
		switch (n) {
		case 0: System.out.print("♣ ");
			break;
		case 1: System.out.print("♦ ");
			break;
		case 2: System.out.print("♥ ");
			break;
		case 3: System.out.print("♠ ");
			break;
		}
	}
}

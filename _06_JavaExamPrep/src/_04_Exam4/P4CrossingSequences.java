package _04_Exam4;

import java.util.ArrayList;
import java.util.Scanner;

public class P4CrossingSequences {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		ArrayList<Long> trib = new ArrayList<>();
		trib.add(inp.nextLong());
		trib.add(inp.nextLong());
		trib.add(inp.nextLong());
		ArrayList<Long> ns = new ArrayList<>();
		ns.add(inp.nextLong());
		int step = inp.nextInt();
		
		long nextTrib = trib.get(trib.size()-1) + trib.get(trib.size()-2) + trib.get(trib.size()-3);
		while(nextTrib <= 1000000) {
			trib.add(nextTrib);
			nextTrib = trib.get(trib.size()-1) + trib.get(trib.size()-2) + trib.get(trib.size()-3);
		}
		
		int skip = 0;
		int skipCounter = 2;
		long nsTemp = ns.get(ns.size()-1);
		while(nsTemp <= 1000000) {
			nsTemp = ns.get(ns.size()-1);
			int currSkip = skip;
			while(currSkip >= 0) {
				nsTemp += step;
				currSkip--;
			}
			ns.add(nsTemp);
			skipCounter--;
			if (skipCounter == 0) {
				skip++;
				skipCounter = 2;
			}
		}
		boolean flag = false;
		for (Long i : trib) {
			if (ns.indexOf(i) != -1) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("No");
		}
	}

}
//to plain string

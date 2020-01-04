package PackTwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

class NumberPalindrome {

	public static void palen(int x) {
		List<String> j = new CopyOnWriteArrayList();
		for (String s : j) {
			
		}
		int orgNum = x;
		int copy = orgNum;
		int reverseNum = 0;

		while (orgNum != 0) {
			int currentNum = orgNum % 10;
			reverseNum = reverseNum * 10 + currentNum;
			orgNum = orgNum / 10;

		}
		if (reverseNum == copy) {
			System.out.println("paliindrom number");
		} else {
			System.out.println("not paliindrom number");
		}
	}

	// public static void palen(int palennum) {
	//
	// int currentnum = palennum;
	// int reverse =0;
	//
	// while(currentnum !=0) {
	//
	// int reminder =0;
	// reminder =currentnum %10;
	// reverse = reverse *10 + reminder;
	// currentnum = currentnum /10;
	//
	// }
	// if (reverse == palennum) {
	// System.out.println("given number is palindrome");
	// }
	// else {
	// System.out.println("given number is not palindrome");
	// }
	//
	//
	// }
	//
	public static void main(String[] args) {

		palen(122);
		palen(131);

	}
}
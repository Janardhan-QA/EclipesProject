package PackTwo;

import java.util.Scanner;

class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner jd = new Scanner(System.in);
		System.out.println("Enter string");
		String orgString = jd.nextLine();

		int start = 0;
		int end = orgString.length();
		int middle = (start + end) / 2;
		int i = 0;
		for (; i <= middle; i++) {

			if (orgString.charAt(start) == orgString.charAt(end)) {

				start++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}

	// Scanner a = new Scanner(System.in);
	// System.out.println("Enter the string");
	//
	// String s =a.nextLine();
	//
	// int start ,end ,middle ,i ;
	// start = 0;
	// end =s.length()-1;
	// middle =(start + end)/2;
	//
	// for (i=start ; i<=middle;i++) {
	// if(s.charAt(start)==s.charAt(end)){
	//
	// start++;
	// end--;
	// }else {
	// break;
	//
	// }
	//
	// }
	//
	// if (i == middle+1) {
	//
	// System.out.println("Palindrome");
	// }else {
	// System.out.println("not Palindrome");
	// }
	//
	//
	//
	// }

}

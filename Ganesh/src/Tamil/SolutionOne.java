package Tamil;

import java.util.Scanner;

public class SolutionOne {
	   
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int a2 = sc.nextInt();
		int a1 = a2;
		System.out.print(s1);
		for (int i = 1; i <= (15 - s1.length()); i++) {
			System.out.print(" ");
		}

		int count = 0;
		anu: for (int i = 1; i <= 3; i++) {
			a1 = a1 / 10;
			++count;

			if (a1 == 0)
				break anu;

		}
		if (count == 3) {
			System.out.print(a2);
		} else if (count == 2) {
			System.out.print("0" + a2);
		} else {
			System.out.print("00" + a2);
		}

	}
}
package Tamil;

import java.util.Scanner;

public class JdException {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age : ");
		int age =sc.nextInt();
		if(age>30){
			throw new Validity("not fit for marriage");
		}
		else {
			throw new Validity("fit for marriage");
		}
	}
	
}

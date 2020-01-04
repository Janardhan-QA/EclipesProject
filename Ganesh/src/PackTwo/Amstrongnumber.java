package PackTwo;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ") ;
		 
		  int num =  sc.nextInt();
		  System.out.println(num);
		    int cnum = num ;
		    int sum=0;
		    while(cnum>0) {
		    	 int rem = cnum%10;
		    	 
		    	 sum = rem*rem*rem +sum ;
		    	 
		    	 cnum =cnum/10;
		    }
		    System.out.println(sum);
		    if (sum==num) {
		    	System.out.println("amstrongnumber");
		    }else {
		    	System.out.println("non amst");
		    }
		   
		  
		  
		
	}

}

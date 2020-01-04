package PackTwo;

import java.awt.Label;
import java.io.IOException;

import Sell.Jannu1;

public class A {

	
	
	
    public static void main(String[] args) {
    	int a[] = {1,2,3};
    	int len = a.length;
    	start :
		for (int i = 0; i <= len - 1; i++) {
			int b = a[i];
			if (b == 0)
				continue;
			if ((len-1- b) == b  ) {

				for (int j = i; j <= len - 1; j++) {
					if (b <= a[j]) {
						if (j == (len - 1)) {
							System.out.println("Magic" +" "+ b);
						}

					} else {
						System.out.println("NO Magic");
						break start;
					}
				}
			}else {
				System.out.println("NO Magic");
				break start;
			}
    		
    		
    		
    	}
    	
    	
//    		  
    }
}



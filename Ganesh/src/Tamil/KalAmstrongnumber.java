package Tamil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import bsh.org.objectweb.asm.Label;

public class KalAmstrongnumber {
	
	
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           FileReader fr1 = new FileReader("Insta1.txt");
           
           //FileReader fr3=new FileReader("abcd.txt");
	       BufferedReader br1 = new BufferedReader(fr1);
	      
	       PrintWriter pw = new PrintWriter("abcd.txt");
	       String line1=br1.readLine();
	       
		while (line1 != null) {
			FileReader fr2 = new FileReader("abc.txt");
			
			 BufferedReader br2 = new BufferedReader(fr2);
			String line2 = br2.readLine();
			Outer: while (line2 != null) {
				if (line1.equals(line2)) {
					
					break Outer;
				} else {
					pw.println(line1);
					System.out.println (line1);       
				}
				line2 = br2.readLine();
			}
			line1=br1.readLine();
		}
	       

	        
	 System.out.println ("the end");       
		 
		 
		
	}

}

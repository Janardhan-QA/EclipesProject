package PackTwo;


public class Fibnosis {
	 
	public static void main(String[] args) 
	{
		int maxnumber =10;
		int previousno=0;
		int nextnumber =1;
		
		for(int i=1;i<=maxnumber;i++) {
			System.out.print(previousno + " ");
			
			   int sum = nextnumber + previousno;
			   previousno=nextnumber;
			   nextnumber=sum;
		}
 
	}
 
}
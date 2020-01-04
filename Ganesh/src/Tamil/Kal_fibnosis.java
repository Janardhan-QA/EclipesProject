package Tamil;

public class Kal_fibnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int previousnum =0;
		  int nextnum=1;
		  int max=10;
		  for(int i=1;i<=max;i++)
		  {
			  int sum=0;
			  System.out.println(previousnum +" ");
			    sum =previousnum+nextnum;
			    previousnum=nextnum;
			   nextnum=sum;
			    
		  }
	}

}

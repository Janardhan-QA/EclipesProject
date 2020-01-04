package Tamil;

public class Pyramid {
	static {
		String s =null;
		System.out.println(s.length());
	}

	 static int x=10/0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print('*');
				
			}
			System.out.println();
		}

	}

}

package Tamil;

public class StrTamil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s = new String("maha");
		String s1 = new String("maha");
		String s2 =s;
		 System.out.println(s==s1);
		 System.out.println(s.equals(s1));
		 System.out.println(s==s2);
		 System.out.println(s.equals(s2));
		 
		Integer i =new Integer(1);
		StringBuffer sb = new StringBuffer("lakshmi");
		StringBuffer sb1 = new StringBuffer("lakshmi");
		StringBuffer sb2=sb;
		
		 System.out.println(sb==sb1);
		 System.out.println(sb.equals(sb1));
		 System.out.println(sb==sb2);
		 System.out.println(sb.equals(sb2));
		
		  
	}

}

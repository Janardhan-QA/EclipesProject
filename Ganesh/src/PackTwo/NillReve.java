package PackTwo;

public class NillReve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s ="abcde";
     byte[] b =s.getBytes();
     byte[] c = new byte[b.length];
     
     for(int i=0;i<b.length;i++) {
    	 
    	    c[i]=b[b.length-i-1];
     }
     System.out.println(new String(c));
		
		  
	}

}

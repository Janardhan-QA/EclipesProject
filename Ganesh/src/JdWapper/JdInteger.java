package JdWapper;

public class JdInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1 = new String("128");
          String s2= new String("200.0f");
          String s3= new String("a");
            Integer i= Integer.valueOf(s1) ;
            System.out.println(i+100);
            Float i1=Float.valueOf(s2);
            System.out.println(i1);
            Byte b = Byte.valueOf(s1);
            System.out.println(b);
	}

}

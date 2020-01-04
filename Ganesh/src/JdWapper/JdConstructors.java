package JdWapper;

public class JdConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer i = new Integer(10);  // primitive to object type (Integer)
         Integer i1= new Integer("10"); // String to object type
        // Integer i2 = new Integer("ten");// Number formate Exception
         Double d = new Double(10.55); // primitive to object type 
         Double d1 = new Double("10.55"); // String to object type
         Float f = new Float(10.1f); // float to object type
         Float f1=new Float("10.1f"); // String to object Type
         Float f2=new Float(10.5);// Double to object type
         
         Character c = new Character('a');
         Boolean b = new Boolean(true);
         System.out.println(b); // true is output
         Boolean b1=new Boolean(false);
         System.out.println(b1); // false is output
         Boolean b3 = new Boolean("true");
         System.out.println(b3); //true is output
         Boolean b4=new Boolean("True");
         System.out.println(b4);// true is output
         Boolean b5=new Boolean("jananu");
         System.out.println(b5);//false is output
         
         
	}

}

package JdCollection;

import java.util.LinkedHashSet;

public class JdLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashSet lhs = new LinkedHashSet();
         lhs.add(1);
         lhs.add('a');
         lhs.add("string");
         lhs.add(null);
         System.out.println(lhs.add(null));
         System.out.println(lhs);// insersion order is preserved 
         
		
		 
	}

}

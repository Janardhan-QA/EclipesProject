package JdCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JdSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		   ar.add(1);
		   ar.add(100);
		   ar.add(50);
		   ar.add(2);
		   ar.add(500);
		  
		   System.out.println(ar);
		   Collections.sort(ar);
		   System.out.println(ar);
//		   Collections.sort(ar,new Comp1());
//		   System.out.println(ar);
		   System.out.println(Collections.binarySearch(ar,500));
		   System.out.println(Collections.binarySearch(ar,150));
	}

}

   class Comp1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer s1=(Integer) o1;
		Integer s2 = (Integer)o2;
		return s2.compareTo(s1) ;
	}
	   
   }

package JdCollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;

public class JdIndentityHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		HashMap i = new HashMap();
		 Integer j = new Integer(10);
		 Integer j1=new Integer(10);
		 i.put(j, "jannu");
		 i.put(j1,"Ok");
		 System.out.println(i);
		    
  
	}

}
class JdComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		    
		   Integer I1= (Integer) o1;
		   Integer I2=(Integer) o2;
		// TODO Auto-generated method stub
		   System.out.println(I1);
		   System.out.println(I2);
		 if(I1>I2) {
			 return -1;
		 }else if(I1<I2) {
			 return +1;
			 
		 }else
		return 0;
	}
	
}

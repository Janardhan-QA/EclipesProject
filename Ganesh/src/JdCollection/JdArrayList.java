package JdCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JdArrayList  {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException  {
		// TODO Auto-generated method stub
               
           // Class.forName("JdCollection.JdCollection");
           ArrayList  ar = new ArrayList();
           
            ar.add('a');
		    ar.add(1);
		    ar.add("jannu");
		    ar.add(12.0f);
		    ar.add(123.123);
		    ar.add('a');
		    ar.add(null);
		    System.out.println(ar);
		    ar.add(0,"kalyani"); // list method
		    ar.add("====");
		    System.out.println( ar.size());
		    ar.addAll(JdCollection.c);
		    System.out.println( ar.size());
		    System.out.println( ar);
		    System.out.println( ar.indexOf('a'));// list method
		    System.out.println( ar.lastIndexOf('a'));// list method
		    System.out.println( ar.get(9));// list method
		    System.out.println( ar.set(9, "Darling"));// list method
		   System.out.println( ar.remove(1));// list method removes element at that point 
		     ListIterator li=ar.listIterator(); // list method 
		    
		    
		   
	}

	

}

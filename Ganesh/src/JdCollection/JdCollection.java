package JdCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class JdCollection {
static  Collection c = new ArrayList();

   static{
	System.out.println("Static block");
	c.add("---AAA--");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(c);
		  c.add('Z');
		  c.add(1);
		  c.add(10.98);
		  c.add("jannu");
		  c.add(null);
		  System.out.println(c);
		  c.addAll(c); // adding a collection to collection
		  System.out.println(c);
		  System.out.println("size of collecton is : "+ c.size());  // returns the size of the collection
		  
		  System.out.println("collection contains the object :"+c.contains(1));
		
		  System.out.println("collection contains the collection: "+c.containsAll(c));
		  System.out.println("this collection is Empty:  "+c.isEmpty());
         Object[] a=c.toArray();
           Iterator i = c.iterator();
		 // c.clear(); to remove all objects in collections
          
		  System.out.println(c.remove(1));	  System.out.println(c);
		  //System.out.println(c.removeAll(c));
		  System.out.println(c);
		  System.out.println();
		  
	}

}

package JdCollection;

import java.util.LinkedList;

public class jdLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList ll = new LinkedList();
         ll.add('a');
         ll.add(123);
         ll.add("jannu");
         ll.add(null);
         ll.add(1.091);
         ll.add(0,"first");
         System.out.println(ll);
         System.out.println(ll.contains('a')); 
         System.out.println(ll.remove(1));
         System.out.println(ll);
         
         
      
	}

}

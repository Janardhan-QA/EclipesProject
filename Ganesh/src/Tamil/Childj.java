package Tamil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



class Childj 
 {
	public static void main(String args[]) {
	 
		 LinkedList ll = new LinkedList();
		 ll.add(123);
		 ll.add("String");
		 ll.add('A');
		 ll.addFirst(null);
		 ll.addLast(12.12);
		 System.out.println(ll);
//		 ll.removeLast();
//		 ll.removeFirst();
//		 System.out.println(ll);
//		 System.out.println(ll.getFirst());
//		 ll.getLast();
//		 System.out.println(ll.getLast());
//		 Object[] a=ll.toArray();
//		 for(Object a1: a) {
//			 System.out.print(a1 +" ");
//		 }System.out.println();
//		 
//		 System.out.println(" iterator elements ");
//		Iterator i=ll.iterator();
//		while(i.hasNext()) {
//			 
//			System.out.println(i.next());
//		}
		ll.add(0,"first object");
		ListIterator li =ll.listIterator();
		
		System.out.println(ll);
		System.out.println(" print in fifo");
		 while(li.hasNext()) {
			 System.out.println(li.next());
		 }
		 System.out.println(" print in lifo");
		 while(li.hasPrevious()) {
			 System.out.println(li.previous());
		 }
		}
   }
	



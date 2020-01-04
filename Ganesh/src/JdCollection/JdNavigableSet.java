package JdCollection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class JdNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet ns = new TreeSet();
		 ns.add("jd");
		 ns.add("anu");
		 ns.add("priya");
		 ns.add("sravs");
		 ns.add("jannu");
		 System.out.println(ns);
		 System.out.println("lower :" +ns.lower("priya"));
		 System.out.println(ns.floor("priya"));
		 System.out.println(ns.higher("jd"));
		 System.out.println(ns.ceiling("jd"));
		 System.out.println(ns.first());
		 System.out.println(ns.last());
		 System.out.println(ns.headSet("jd"));
		 System.out.println(ns.tailSet("jd"));
		 System.out.println(ns.pollFirst());
		 System.out.println(ns.pollLast());
		 //System.out.println(ns.descendingSet());
		 System.out.println(ns);
		    Iterator i= ns.descendingIterator();
		    System.out.println("jd iterator desc");
		    while(i.hasNext() ) {
		    	System.out.println(i.next());
		    }
		 
		 

	}

}

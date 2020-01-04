package JdCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class JdTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SortedSet t = new TreeSet();
         
          System.out.println(t);
         // t.add(1);
          t.add(new Integer(10));
//          t.add(2);
//          t.add(3);
//          t.add(2);
//          t.add(4);
//          
          System.out.println(t);
            int a =(int) t.first();
            System.out.println(t.last());
            System.out.println(t.headSet(1));
            System.out.println(t.tailSet(5));
            System.out.println(t.first());
	}

}

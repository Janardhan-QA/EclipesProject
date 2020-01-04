package JdCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class JdSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SortedSet ss = new TreeSet();
          ss.add(10);
          ss.add(1);
          ss.add(5);
          ss.add(0);
          ss.add(13);
          System.out.println(ss);
          System.out.println(ss.first());
          System.out.println(ss.last());
          System.out.println(ss.headSet(5));
          System.out.println(ss.tailSet(5));
          System.out.println(ss.subSet(1, 14));
          System.out.println(ss.comparator());
	}

}

package JdCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class JdComparatorStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		   TreeSet ts = new TreeSet(new JdCompStringBuffer());
		   ts.add(new StringBuffer("A"));
		   ts.add(new StringBuffer("B"));
		   ts.add(new StringBuffer("Z"));
		   ts.add(new StringBuffer("AA"));
		   ts.add(new StringBuffer("C"));
		   System.out.println(ts);
		 
	}

}

class JdCompStringBuffer implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2=o2.toString();
		
		return -s1.compareTo(s2);
	}
	
}

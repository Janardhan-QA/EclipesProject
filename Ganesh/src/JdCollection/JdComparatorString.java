package JdCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class JdComparatorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new JdcompString());
		ts.add("AA");
		ts.add("Z");
		ts.add("B");
		ts.add("C");
		ts.add("AB");
		ts.add("JANNU");
		System.out.println(ts);

	}

}

class JdcompString implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
	}
	
}

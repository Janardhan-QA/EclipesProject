package JdCollection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JdSortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		SortedMap sm = new TreeMap();
		sm.put("Zzz", 101);
		sm.put("Jzaa", 100);
		sm.put("Aaa", 120);
		sm.put("Bbb", 11);
		sm.put("Ccc", 13);
		sm.put("Anu", 12);
		System.out.println(sm);
		System.out.println(sm.headMap("Ccc"));
		System.out.println(sm.tailMap("Ccc"));
		System.out.println(sm.subMap("Anu","Jzaa"));
		System.out.println(sm.containsKey("Anu"));
		System.out.println(sm.containsValue(100));
		Set s = sm.keySet();
		System.out.println(s);
		Collection c = sm.values();
		System.out.println(c);
		System.out.println(sm.entrySet());
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		sm.comparator();
		System.out.println(sm.comparator());
		SortedMap sm1 = new TreeMap(new Comp());
		System.out.println(sm1);
		System.out.println(sm1.comparator());
		
		
		
		
		
		
		
	}

}

class Comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

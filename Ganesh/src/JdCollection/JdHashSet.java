package JdCollection;

import java.util.HashSet;

public class JdHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashSet hs = new HashSet();
          hs.add('a');
          hs.add(123);
          hs.add("jannu");
          hs.add(null);
          System.out.println( hs);
          System.out.println( hs.add('a'));
	}

}

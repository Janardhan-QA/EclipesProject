package JdCollection;

import java.util.TreeSet;

public class JdComparatorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TreeSet ts= new TreeSet(new JdCompNum());
           ts.add(1);
           ts.add(10);
           ts.add(20);
           ts.add(5);
           ts.add(15);
           ts.add(25);
           ts.add(35);
           System.out.println(ts);
	}

}


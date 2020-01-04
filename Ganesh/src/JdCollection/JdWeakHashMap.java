package JdCollection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class JdWeakHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashMap h = new HashMap();
		
		Test t = new Test();
		h.put(t,"jannu");
		System.out.println(h);
		t=null;
		System.gc();
		System.out.println(h);
		
		
	}

}
class Test{
	public String toString() {
		return "Test";
	}
	
}
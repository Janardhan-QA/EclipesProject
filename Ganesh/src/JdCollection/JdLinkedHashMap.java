package JdCollection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JdLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("anusha","true love");
		lhm.put("jannu",143);
		lhm.put("sravs", "bestfriend");
		lhm.put("priya", "good morning");
		lhm.put("kalyani", "fiance");
		lhm.put(null,123);
		System.out.println(lhm);
		System.out.println(lhm.size());
		System.out.println(lhm.isEmpty());
		System.out.println(lhm.containsKey("anusha"));
		System.out.println(lhm.containsValue("true love"));
		System.out.println("key set : "+lhm.keySet());
		System.out.println(lhm.values());
		System.out.println("entry set : "+lhm.entrySet());
		Set s= lhm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			System.out.println("==== ====");
			
			if(e.getValue().equals("i don't know")) {
				e.setValue("Fiance") ;
			}
			System.out.println(e.getKey() +"--" +e.getValue());
		}

		

	}

}

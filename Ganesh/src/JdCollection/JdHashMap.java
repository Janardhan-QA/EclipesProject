package JdCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JdHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap hm = new HashMap();
     hm.put("jannu", 143);
     hm.put("kalyani", 123);
     hm.put("anusha", 741);
     hm.put("priya", 810);
     System.out.println(hm);
     hm.put("jannu",999);
     System.out.println(hm);
     hm.put("sravini",null);
     hm.put(null,"jio");
     System.out.println(hm);
     System.out.println(hm.containsKey("jannu"));
     System.out.println(hm.containsValue(143));
     System.out.println(hm.get("anusha"));
     System.out.println(hm.isEmpty());
     System.out.println(hm.size());
     System.out.println("key set : "+ hm.keySet());
     System.out.println(" values : "+ hm.values());
     System.out.println(" entry set : " + hm.entrySet());
     System.out.println(hm.remove("sravini"));
       Set s =hm.entrySet();
           Iterator itr =s.iterator();
           while(itr.hasNext()) {
        	     Map.Entry m=(Map.Entry) itr.next();
        	     
        	     if(m.getKey().equals("anusha")) {
        	    	 m.setValue("8143888492");
        	     }
        	     System.out.println(m.getKey());
        	     System.out.println(m.getValue());
           }
       
           System.out.println(hm);
  	  
		
		
		 
	}

}

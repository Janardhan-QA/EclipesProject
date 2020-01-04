package JdCollection;

import java.util.TreeMap;

public class JdTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeMap tm = new TreeMap();
         tm.put("Aaa", 12);
         tm.put("123", 12);
         tm.put("Bbb", null);
         tm.put("Aaa", 24); // duplicate vales are not allowed if found then it replaces the values
         tm.size();
         tm.put("1234", 234); // doesn't null entry : gives null pointer exception 
         
        System.out.println(tm.size());
       System.out.println(tm.isEmpty());
       System.out.println(tm.containsKey("123"));
       System.out.println(tm.containsValue(null));
       System.out.println("key set : " + tm.keySet());
       System.out.println("values : "+ tm.values());
       //System.out.println(tm.);
         
	}

}

package JdCollection;

import java.util.Vector;

public class JdVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector v =new Vector(2);
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
        //System.out.println(v.elementAt(2));
        System.out.println(v.capacity());
        v.trimToSize();
        System.out.println(v.capacity());
        v.removeElement(2);
        v.remove(0);
        System.out.println(v);
        
		 
	}

}

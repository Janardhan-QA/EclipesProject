package JdCollection;

import java.util.Comparator;

public class JdCompNum implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		  Integer I1 = (Integer)o1;
		  Integer I2 = (Integer)o2;
		  
		  if(I1>I2) {
			  return -1;
			  }
		  else if(I1<I2){
			  return +1;
			  
		  }
		  else
		return 0;
	}

}

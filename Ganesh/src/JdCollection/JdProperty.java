package JdCollection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JdProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 Properties p = new Properties();
		 
		 FileInputStream fip = new FileInputStream("/Users/janardhanreddy/eclipse-workspace/Ganesh/src/JdCollection/abcjd.txt");
		  p.load(fip);
		  System.out.println(p.getProperty("jannu"));
		  //p.getProperty("jannu");
		  p.setProperty("anusha","7416305458");
		  FileOutputStream fos = new FileOutputStream("/Users/janardhanreddy/eclipse-workspace/Ganesh/src/JdCollection/abcjd.txt");
				 
		  p.store(fos, "anu number updated ");
	}

}

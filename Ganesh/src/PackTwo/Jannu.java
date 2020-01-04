package PackTwo;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(PackTwo.JdListner.class)
public class Jannu {
  
	
	  

	@BeforeSuite
	  public void beforeSuite(){
		  System.out.println("in Before Suite");
	  }
	  
	  @AfterSuite
	   public void afterSuite(){
		   System.out.println("in After Suite");
	   }
	  
	  @BeforeClass
	    public void beforeClass() {
	       System.out.println("in Before Class");
	    }
	 
	    @AfterClass
	    public void afterClass() {
	       System.out.println("in After Class");
	    }
	    
	    @BeforeTest
	    public void beforeTest() {
	    	 System.out.println("in before Test");
	    	
	    }
	    
	    @AfterTest
	    public void afterTest() {
	    	 System.out.println("in After test");
	    }
	  
	  @BeforeMethod
	  public void beforemethod(){
		  
		  System.out.println("in Before METHOD");
	  }
	  
	  @AfterMethod
	  public void afterMethod(){
		  System.out.println("in AFTER METHOD ");
		  
	  }
	  
	
	  
	  
	   @Test(groups = {"jd"}  )
	   public void testCase1(){
		   System.out.println("in test Case 1 ");
		   throw new SkipException(" throw new SkipException");
       }
	   
	   @Test(groups = {"jd"})
	   public void testCase2(){
		   
		   SoftAssert sf = new SoftAssert();
		   
		    sf.assertTrue(false);
		   System.out.println("in test Case 2 ");
		  sf.assertAll();
       }
	   
	   @Test(groups = {"md"} )
	   @Parameters("Emp")
	   public void testCase3(String Emp){
		   Assert.assertTrue(false, " ASSERT HAS FAILED MESSAGE");
		    {
			   
			   System.out.println("Waste guy");
			   
		   }
		   System.out.println("INCOMPLETE TEST ");
		   
       }
	   
	  
	   
	
}

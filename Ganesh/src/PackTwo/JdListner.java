package PackTwo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class JdListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 
			    System.out.println("The name of the testcase passed is :"+result.getName()); 
   }

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase Failed is :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase SKIPPED is :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

package MultiThreadingJd;

public class MyThread extends Thread {
	
	static Thread mt;
	
	
	public void run() {
		
		try {
			  Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=10;i<10;i++) {
			
			System.out.println("child thread");
		}
		
	}

}

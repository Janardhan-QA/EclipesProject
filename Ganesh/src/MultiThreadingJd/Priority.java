package MultiThreadingJd;

public class Priority {

	 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread.mt= Thread.currentThread();
		 System.out.println(MyThread.mt);
          MyThread t2=new MyThread();
          
          t2.start();
          t2.interrupt();
          for(int i=0;i<10;i++) {
      		System.out.println("main thread");
      		}
          
	}

}

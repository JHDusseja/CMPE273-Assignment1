package JavaThreads;

public class ThreadTwo extends Thread{
	private Thread t;
	private String tName;

   ThreadTwo( String name) {
      tName = name;
   }

   public void run() {
	  try {
	     for(int i = 1; i <= 10; i++) {
	    	 System.out.println("Thread: " + tName + " : " + new ThreadPrint().PrintMultiple(this.tName, i));
	        // Let the thread sleep for a while.
	        Thread.sleep(10);
	     }
	  }catch (InterruptedException e) {
	     System.out.println("Thread " +  tName + " interrupted.");
	  }
   }
   
   public void start () {
      if (t == null) {
         t = new Thread (this, tName);
         t.start();
      }
   }
}
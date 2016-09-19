package JavaThreads;

public class JavaMulltiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwo T1 = new ThreadTwo( "Thread - 2");
	    T1.start();
	      
	    ThreadTwo T2 = new ThreadTwo( "Thread - 3");
	    T2.start();
	}

}

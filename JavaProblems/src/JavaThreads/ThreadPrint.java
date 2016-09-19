package JavaThreads;

public class ThreadPrint {
	synchronized public String PrintMultiple(String n, int i){
		if(n.equals("Thread - 2"))
			return ("2 * " + i + " = " + (i * 2));
		else if(n.equals("Thread - 3"))
			return ("3 * " + i + " = " + (i * 3));
		else
			return "Invalid Thread";
	}
}

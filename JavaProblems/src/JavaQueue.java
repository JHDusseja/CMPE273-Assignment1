import java.util.*;

public class JavaQueue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numbers = Integer.parseInt("10");
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> reversedQ = new LinkedList<Integer>();
        
        for (int i = numbers; i >= 0; i--)
            queue.add(i);
        
        System.out.print("Original Queue:");
        for(int n : queue) { 
        	System.out.print(" " + n); 
        }
        
        reverseQueue(queue,reversedQ);
        
        System.out.print("\nReversed Queue:");
        for(int n : reversedQ) { 
        	System.out.print(" " + n); 
        }
	}
	
	public static void reverseQueue(Queue<Integer> orgQ, Queue<Integer> revQ){
		int temp = orgQ.remove();
		if(!orgQ.isEmpty())
			reverseQueue(orgQ,revQ);
		revQ.add(temp);
	}

}

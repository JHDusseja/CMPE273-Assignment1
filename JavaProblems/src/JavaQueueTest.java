import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class JavaQueueTest {

	@Test
	public void testReverseQueue1() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(1); myq.add(2); myq.add(3);
		exprevq.add(3); exprevq.add(2); exprevq.add(1);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}
	
	@Test
	public void testReverseQueue2() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(1);
		exprevq.add(1);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}
	
	@Test
	public void testReverseQueue3() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(11); myq.add(12); myq.add(43);
		exprevq.add(43); exprevq.add(12); exprevq.add(11);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}
	
	@Test
	public void testReverseQueue4() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(-1); myq.add(2); myq.add(-3);
		exprevq.add(-3); exprevq.add(2); exprevq.add(-1);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}
	
	@Test
	public void testReverseQueue5() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(0);
		exprevq.add(0);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}
	
	@Test
	public void testReverseQueue6() {
		Queue<Integer> myq = new LinkedList<Integer>();
		Queue<Integer> myrevq = new LinkedList<Integer>();
		Queue<Integer> exprevq = new LinkedList<Integer>();
		myq.add(45); myq.add(34); myq.add(23);myq.add(90); myq.add(345); myq.add(67);
		exprevq.add(67); exprevq.add(345); exprevq.add(90);exprevq.add(23); exprevq.add(34); exprevq.add(45);
		
		JavaQueue.reverseQueue(myq, myrevq);
		
		assertEquals(exprevq,myrevq);
	}

}

package JavaThreads;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaMulltiThreadTest {

	@Test
	public void test1() {
		int i = 2;
		String actual = new ThreadPrint().PrintMultiple("Thread - 2", i);
		String expected = ("2 * " + i + " = " + (i * 2));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		int i = 3;
		String actual = new ThreadPrint().PrintMultiple("Thread - 2", i);
		String expected = ("2 * " + i + " = " + (i * 2));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		int i = 4;
		String actual = new ThreadPrint().PrintMultiple("Thread - 3", i);
		String expected = ("3 * " + i + " = " + (i * 3));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
		int i = 2;
		String actual = new ThreadPrint().PrintMultiple("Thread - 4", i);
		String expected = "Invalid Thread";
		assertEquals(expected,actual);
	}
	
	@Test
	public void test5() {
		int i = 2;
		String actual = new ThreadPrint().PrintMultiple("Thread - 5", i);
		String expected = "Invalid Thread";
		assertEquals(expected,actual);
	}
	
	@Test
	public void test6() {
		int i = 10;
		String actual = new ThreadPrint().PrintMultiple("Thread - 3", i);
		String expected = ("3 * " + i + " = " + (i * 3));
		assertEquals(expected,actual);
	}

}

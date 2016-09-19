import static org.junit.Assert.*;

import org.junit.Test;

public class JavaStackTest {

	@Test
	public void testCheckEx1() {
		String in = "((hello))";
		assertEquals(true,JavaStack.checkEx(in));
	}
	
	@Test
	public void testCheckEx2() {
		String in = "(())";
		assertEquals(true,JavaStack.checkEx(in));
	}
	
	@Test
	public void testCheckEx3() {
		String in = "(()";
		assertEquals(false,JavaStack.checkEx(in));
	}
	
	@Test
	public void testCheckEx4() {
		String in = "((";
		assertEquals(false,JavaStack.checkEx(in));
	}
	
	@Test
	public void testCheckEx5() {
		String in = "))";
		assertEquals(false,JavaStack.checkEx(in));
	}
	
	@Test
	public void testCheckEx6() {
		String in = "((h(ello))sdf)";
		assertEquals(true,JavaStack.checkEx(in));
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaArrayTest {

	@Test
	public void test1() {
		int[] myarr = {1,2,3};
		int element = 2;
		assertEquals(1,JavaArray.search(myarr, element));
	}
	
	@Test
	public void test2() {
		int[] myarr = {1,2,3,4,5};
		int element = 5;
		assertEquals(4,JavaArray.search(myarr, element));
	}
	
	@Test
	public void test3() {
		int[] myarr = {2,33,56,87,12};
		int element = 56;
		assertEquals(2,JavaArray.search(myarr, element));
	}
	
	@Test
	public void test4() {
		int[] myarr = {3,6,9,23,57,89};
		int element = 77;
		assertEquals(-1,JavaArray.search(myarr, element));
	}
	
	@Test
	public void test5() {
		int[] myarr = {45,67};
		int element = 0;
		assertEquals(-1,JavaArray.search(myarr, element));
	}
	
	@Test
	public void test6() {
		int[] myarr = {9};
		int element = 9;
		assertEquals(0,JavaArray.search(myarr, element));
	}
}

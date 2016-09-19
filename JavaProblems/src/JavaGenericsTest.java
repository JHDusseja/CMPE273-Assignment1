import static org.junit.Assert.*;

import org.junit.Test;

public class JavaGenericsTest {

	@Test
	public void test1() {
		Integer myIntArr[] = {2,14,7,38,56};
		Integer expArr[] = {56,38,14,7,2};
		
		assertEquals(expArr,JavaGenerics.descSort(myIntArr));
	}
	
	@Test
	public void test2() {
		Double myDoubleArr[] = {23.45,56.98,34.54,3.45,1.34};
		Double expDoubleArr[] = {56.98,34.54,23.45,3.45,1.34};
		
		assertEquals(expDoubleArr,JavaGenerics.descSort(myDoubleArr));
	}
	
	@Test
	public void test3() {
		String myStringArr[] = {"Jack","Carnie","Anthony","Michele","Brad"};
		String expStringArr[] = {"Michele","Jack","Carnie","Brad","Anthony"};
		
		assertEquals(expStringArr,JavaGenerics.descSort(myStringArr));
	}
	
	@Test
	public void test4() {
		Character myCharArr[] = {'A','X','Z'};
		Character expArr[] = {'Z','X','A'};
		
		assertEquals(expArr,JavaGenerics.descSort(myCharArr));
	}
	
	@Test
	public void test5() {
		Integer myIntArr[] = {2,14,77,383,156};
		Integer expArr[] = {383,156,77,14,2};
		
		assertEquals(expArr,JavaGenerics.descSort(myIntArr));
	}
	
	@Test
	public void test6() {
		Integer myIntArr[] = {2};
		Integer expArr[] = {2};
		
		assertEquals(expArr,JavaGenerics.descSort(myIntArr));
	}

}

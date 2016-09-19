import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class JavaCollectionsTest {

	@Test
	public void testCheckMax1() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 3);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 10);
		
		assertEquals("Praveen",JavaCollections.checkMax(empDetails));
	}
	
	@Test
	public void testCheckMax2() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 3);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 55);
		empDetails.put("Praveen", 10);
		
		assertEquals("Suresh",JavaCollections.checkMax(empDetails));
	}
	
	@Test
	public void testCheckMax3() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 66);
		empDetails.put("Rahul", 3);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 10);
		
		assertEquals("Ajay",JavaCollections.checkMax(empDetails));
	}
	
	@Test
	public void testCheckMax4() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 33);
		empDetails.put("Vicky", -7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 10);
		
		assertEquals("Rahul",JavaCollections.checkMax(empDetails));
	}
	
	@Test
	public void testCheckMax5() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 3);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 0);
		
		assertEquals("Vicky",JavaCollections.checkMax(empDetails));
	}
	
	@Test
	public void testCheckMax6() {
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 13);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 10);
		
		assertEquals("Rahul",JavaCollections.checkMax(empDetails));
	}

}

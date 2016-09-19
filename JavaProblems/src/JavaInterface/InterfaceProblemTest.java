package JavaInterface;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceProblemTest {

	@Test
	public void test1() {
		Car mycar = new Accord();
		assertEquals("Your Car's Gas Mileage is 27 MPG",mycar.Mileage());
	}

	@Test
	public void test2() {
		Car mycar = new Challenger();
		assertEquals("Your Car's Gas Mileage is 19 MPG",mycar.Mileage());
	}
	
	@Test
	public void test3() {
		Car mycar = new Prius();
		assertEquals("Your Car's Gas Mileage is 50 MPG",mycar.Mileage());
	}
}

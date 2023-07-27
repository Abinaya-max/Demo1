package ap.demo1.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyoperationsTest {

	@Test
	public void testAddPositivevalue() {
		assertEquals(8,new Myoperations().add(3, 5));
	}
	@Test
	public void testAddNegativevalue() {
		assertEquals(-27,new Myoperations().add(-23, -4));
	}

	@Test
	public void testGetFullName() {
		assertEquals("Abinaya kannan",new Myoperations().getMyName("Abinaya","kannan"));
	}

}

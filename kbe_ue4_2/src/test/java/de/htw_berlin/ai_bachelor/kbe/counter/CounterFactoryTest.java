package de.htw_berlin.ai_bachelor.kbe.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterFactoryTest {

	
	@Test
	public void  testGetCounterInstance(){
		 Counter actual = CounterFactory.getCounterInstance("hallo");
		 assertNull(actual);
	}
	
	@Test
	public void testGetCounterInstanceSimple() {
		Counter expected = CounterSimple.getInstance();
		Counter actual = CounterFactory.getCounterInstance("simple");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCounterInstanceDouble() {
		Counter expected = CounterDouble.getInstance();
		Counter actual = CounterFactory.getCounterInstance("double");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCounterInstanceTriple() {
		Counter expected = CounterTriple.getInstance();
		Counter actual = CounterFactory.getCounterInstance("triple");
		assertEquals(expected, actual);
	}

}

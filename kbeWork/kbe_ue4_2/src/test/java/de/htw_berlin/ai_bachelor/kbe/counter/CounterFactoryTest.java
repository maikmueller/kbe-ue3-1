package de.htw_berlin.ai_bachelor.kbe.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterFactoryTest {

	@Test
	public void testGetCounterInstanceWithSimple() {
		
		Counter c = CounterFactory.getCounterInstance("simple");
		String expectedClassname = "class de.htw_berlin.ai_bachelor.kbe.counter.CounterSimple";
		String actualClassname = c.getClass().toString();
		assertEquals(expectedClassname, actualClassname);
	}

	@Test
	public void testGetCounterInstanceWithIrgendwas() {

		Counter c = CounterFactory.getCounterInstance("irgendwas");
		String expectedClassname = "class de.htw_berlin.ai_bachelor.kbe.counter.CounterSimple";
		String actualClassname = c.getClass().toString();
		assertEquals(expectedClassname, actualClassname);
	}
	
	@Test
	public void testGetCounterInstanceWithEmptyString() {

		Counter c = CounterFactory.getCounterInstance("");
		String expectedClassname = "class de.htw_berlin.ai_bachelor.kbe.counter.CounterSimple";
		String actualClassname = c.getClass().toString();
		assertEquals(expectedClassname, actualClassname);
	}
	
	@Test
	public void testGetCounterInstanceWithDouble() {

		Counter c = CounterFactory.getCounterInstance("double");
		String expectedClassname = "class de.htw_berlin.ai_bachelor.kbe.counter.CounterDouble";
		String actualClassname = c.getClass().toString();
		assertEquals(expectedClassname, actualClassname);
	}
	
	@Test
	public void testGetCounterInstanceWithTriple() {
		Counter c = CounterFactory.getCounterInstance("triple");
		String expectedClassname = "class de.htw_berlin.ai_bachelor.kbe.counter.CounterTriple";
		String actualClassname = c.getClass().toString();
		assertEquals(expectedClassname, actualClassname);

	}

}

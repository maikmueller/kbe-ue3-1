package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements Counter {
	
	private int counter = 0;
	private static CounterSimple cs;
	
	private CounterSimple() {
	}
	
	public static CounterSimple getInstance()
	{
		if (cs == null)
		{
			cs = new CounterSimple();
		}
		return cs;
	}
	
	public void increment()
	{
		counter++;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	

}

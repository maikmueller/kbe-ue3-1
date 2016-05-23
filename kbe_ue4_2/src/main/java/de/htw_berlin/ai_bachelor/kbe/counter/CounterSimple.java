package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements Counter {
	private  int counter = 0;
	
	private static CounterSimple counterSimple = new CounterSimple();
	
	private CounterSimple(){}
	
	public static CounterSimple getInstance(){
		return counterSimple;
	}
	
	
	public void increment(){
		counter++;
	}
	
	public int getCounter(){
		return counter;
	}
}

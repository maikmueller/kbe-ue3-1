package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterTriple implements Counter {
	private  int counter = 0;
	
	private static CounterTriple counterTriple = new CounterTriple();
	
	private CounterTriple(){}
	
	public static CounterTriple getInstance(){
		return counterTriple;
	}
	
	
	public void increment(){
		counter *= 3;
	}
	
	public int getCounter(){
		return counter;
	}
}

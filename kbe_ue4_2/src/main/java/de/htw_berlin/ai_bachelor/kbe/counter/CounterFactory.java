package de.htw_berlin.ai_bachelor.kbe.counter;

public  class CounterFactory {
	
	public CounterFactory(){}

	public static Counter getCounterInstance(String typ) {
		Counter counterReturn = null;
		if (typ.equals("simple")) counterReturn =  CounterSimple.getInstance();
		else if(typ.equals("double")) counterReturn =  CounterDouble.getInstance(); 
		else if (typ.equals("triple")) counterReturn = CounterTriple.getInstance();
		return counterReturn;
	}
}

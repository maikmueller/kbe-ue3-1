package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterFactory {

	public static Counter getCounterInstance(String typ)
	{
		if (typ.equals("double"))
			return CounterDouble.getInstance();
		else
			if (typ.equals("triple"))
				return CounterTriple.getInstance();
		
		return CounterSimple.getInstance();
	}
}

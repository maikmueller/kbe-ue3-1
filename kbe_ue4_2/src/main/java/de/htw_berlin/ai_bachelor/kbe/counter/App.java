package de.htw_berlin.ai_bachelor.kbe.counter;

public class App 
{
    public static void main( String[] args )
    {
    	String typ = "simple";
    	CounterFactory.getCounterInstance(typ).increment();
    	System.out.println("" + CounterFactory.getCounterInstance(typ).getCounter());
    }
}



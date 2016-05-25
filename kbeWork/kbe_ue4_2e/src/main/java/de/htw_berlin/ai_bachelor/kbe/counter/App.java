package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int count = CounterFactory.getCounterInstance("double").getCounter();
        System.out.println("Zähler = " + count);
    }
}

package de.htw_berlin.ai_bachelor.kbe.date;


public class App 
{
    public static void main( String[] args )
    {
        Datum d = new Datum(29, 11, 2015);
        DateFormat df = new DateFormat();
        df.printFormatted(d);
        df.setFormat("US");
        df.printFormatted(d);
    }
}

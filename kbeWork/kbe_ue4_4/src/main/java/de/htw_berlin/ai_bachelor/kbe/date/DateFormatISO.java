package de.htw_berlin.ai_bachelor.kbe.date;

public class DateFormatISO implements DateFormatter {

	public void printFormatted(Datum datum)
	{
		System.out.printf("%d-%d-%d", datum.getJahr(), datum.getMonat(), datum.getTag());
	}
}

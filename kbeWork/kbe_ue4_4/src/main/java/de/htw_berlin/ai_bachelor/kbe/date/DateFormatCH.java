package de.htw_berlin.ai_bachelor.kbe.date;

public class DateFormatCH implements DateFormatter {

	public void printFormatted(Datum datum)
	{
		System.out.printf("%d.%d.%d", datum.getTag(), datum.getMonat(), datum.getJahr());
	}
}

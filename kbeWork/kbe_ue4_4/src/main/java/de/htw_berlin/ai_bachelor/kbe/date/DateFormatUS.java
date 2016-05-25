package de.htw_berlin.ai_bachelor.kbe.date;

public class DateFormatUS implements DateFormatter {

	public void printFormatted(Datum datum)
	{
		System.out.printf("%d/%d/%d", datum.getMonat(), datum.getTag(),  datum.getJahr());
	}
}

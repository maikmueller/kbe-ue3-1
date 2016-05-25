package de.htw_berlin.ai_bachelor.kbe.date;

public class DateFormat {

	private DateFormatter formatter;
	
	public DateFormat()
	{
		this.formatter = new DateFormatISO();
	}
	
	public void setFormat(String format)
	{
		switch(format) {
		case "CH":
			this.formatter = new DateFormatCH();
			break;
		case "US":
			this.formatter = new DateFormatUS();
			break;
		case "ISO":
		default:
			this.formatter = new DateFormatISO();
			break;
		}
	}

	
	public void printFormatted(Datum datum)
	{
		formatter.printFormatted(datum);
	}
}

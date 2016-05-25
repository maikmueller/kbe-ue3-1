package de.htw_berlin.ai_bachelor.kbe.date;

public class DatumFormatierer {

	private Datum datum;
	private String format;
	
	public DatumFormatierer()
	{
		this.format = "ISO";
	}
	
	public void setFormat(String format)
	{
		this.format = format;
	}
	
	public void printDatumFormatiert(Datum datum)
	{
		//this.datum = datum;
		
		switch(format) {
			
		case "CH":
			System.out.printf("%d.%d.%d", datum.getTag(), datum.getMonat(), datum.getJahr());
			break;
		case "US":
			System.out.printf("%d/%d/%d", datum.getMonat(), datum.getTag(),  datum.getJahr());
			break;
		case "ISO":
		default:
			System.out.printf("%d-%d-%d", datum.getJahr(), datum.getMonat(), datum.getTag());
			break;
		}
	}
}

package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.util.Date;

public class Datum {
	
		private static Date date;
		public static Date getDate(){
			date = new Date();
			date.setTime(System.currentTimeMillis());
			return date;
		}
	}



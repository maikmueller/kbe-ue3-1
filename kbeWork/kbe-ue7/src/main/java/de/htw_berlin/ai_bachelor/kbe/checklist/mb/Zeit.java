package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.Datum;

@ManagedBean(name = "zeitData", eager = true)
@ApplicationScoped
public class Zeit {
Date datum = new Date();
	
	public Zeit(){
		datum = new Date();
		datum.setTime(System.currentTimeMillis());
	}
	
	public Date getDatum(){
		return Datum.getDate();
	}
	
	public String goToTimePage(){
		return "showTime.xhtml";
	}

}

package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class ToDo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private boolean done = false;
	@Future
	private Date due;
	@MyInterval
	private int prio;
	
	public ToDo() {
		super();
		this.name = "";
		this.done = false;
		this.due = new Date((new Date()).getTime() + 86400000);
		this.prio = 1;
	}
	
	
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Date getDue() {
		return due;
	}


	public void setDue(Date due) {
		this.due = due;
	}


	public int getPrio() {
		return prio;
	}


	public void setPrio(int prio) {
		this.prio = prio;
	}

}
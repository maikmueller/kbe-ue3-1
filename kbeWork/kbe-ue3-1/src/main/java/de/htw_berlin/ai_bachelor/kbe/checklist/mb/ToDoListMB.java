package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;


@ManagedBean(name= "ToDoListMB", eager= true)
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;
    private ToDoList toDoList;

	public ToDoListMB() {
		super();
		toDoList = new ToDoList();		
	}
	
	public ToDoList getToDoList() {
		return toDoList;
	}
	

    public String save() {
    	return "save";
    }

}
package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;


@ManagedBean(name= "ToDoMB", eager= true)
@SessionScoped
public class ToDoMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{ToDoListMB}")
	private ToDoListMB toDoListMB;
    
	private ToDo toDo;

	public ToDoMB() {
		super();
		toDo = new ToDo();
	}
	
	public ToDo getToDo() {
		return toDo;
	}
	

    public String save() {
    	toDoListMB.getToDoList().addToDo(this.toDo);
    	return "save";
    }
    
    public void setToDoList(ToDoListMB list)
    {
    	this.toDoListMB = list;
    }

}
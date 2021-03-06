package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

//TODO

@ManagedBean
@SessionScoped

public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private ToDoList toDoList;
   // private List<ToDo> toDo;
    
	public ToDoListMB() {
		super();
		//TODO
		this.toDoList = new ToDoList();
	}
		
	
	/* @brief getter method for to do list
	 * 
	 * @return to do list
	 * 
	 */
//	public int getSizeListMB(){
	//	System.out.println("" + getToDoList().size());
	//	return getToDoList().size();
//	}
	
	public int getCheckedItems(){
		int countDone = 0;
		for (int i = 0; i < getToDoList().size(); i++){
			if (getToDoList().get(i).isDone()){
				countDone++;
			}
		}
		return countDone;
	}
	
	public List<ToDo> getToDoList() {
		
		return this.toDoList.getToDos();
	}
	
	
	
	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	System.out.println("Gespeichert");
    	return "save";
    }
}

package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ToDoList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<ToDo> toDos =  new ArrayList<ToDo>();
	
		
	public ToDoList() {
		super();
	}
	
	
	public List<ToDo> getToDos() {
		return toDos;
	}
	
	public void addToDo(ToDo toDo) {
		toDos.add(toDo);
	}




	public int getListCount() {
		 int listeCount = toDos.size();
		return listeCount;
	}
	
	public int getCountDone(){
		int number = 0;
		
		for (int i = 0; i < toDos.size(); i++){
			
			if(toDos.get(i).isDone()){
				number++;
			}
		}
		System.out.println(number);
		return number;
	}


	
}
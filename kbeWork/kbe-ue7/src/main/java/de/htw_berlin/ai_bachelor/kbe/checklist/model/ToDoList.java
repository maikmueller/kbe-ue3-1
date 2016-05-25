package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ToDoList implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private List<ToDo> toDos =  new ArrayList<ToDo>();
	
		
	
	public ToDoList() {
		super();
		this.setToDos();
	}
	
	
	public List<ToDo> getToDos() {
		return toDos;
	}

	private void setToDos() {
		toDos.add(new ToDo("KBE: Aufgabenzettel 2 bearbeiten"));
		toDos.add(new ToDo("KBE: Zweite Vorlesung nacharbeiten"));
		toDos.add(new ToDo("Lebensmittel einkaufen "));
		toDos.add(new ToDo("Leergut wegbringen"));
		toDos.add(new ToDo("Geburtstagsgeschenk besorgen"));
		toDos.add(new ToDo("Putzen"));
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
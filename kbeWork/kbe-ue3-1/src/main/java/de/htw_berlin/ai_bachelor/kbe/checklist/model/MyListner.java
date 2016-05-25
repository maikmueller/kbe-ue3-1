
package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyListner implements PhaseListener{

	public void beforePhase(PhaseEvent event) {
		System.out.println(event.getPhaseId().toString() + " startet.");
	}
	
	public void afterPhase(PhaseEvent event) {
		System.out.println(event.getPhaseId().toString() + " ist beendet.");
		if(event.getPhaseId() == PhaseId.RESTORE_VIEW){
			if (event.getFacesContext().getCurrentInstance().isPostback() == true){
				System.out.println("Es ist Postback");
				
			} else {
				System.out.println("Es ist nicht Postback");
			}
			System.out.println(event.getFacesContext().getCurrentInstance().getViewRoot().getViewId());
			System.out.println(getChildCount(event.getFacesContext().getCurrentInstance().getViewRoot()));
				
		}
		if(event.getPhaseId()== PhaseId.RENDER_RESPONSE){
			System.out.println(event.getFacesContext().getCurrentInstance().getViewRoot().getViewId());
			System.out.println(getChildCount(event.getFacesContext().getCurrentInstance().getViewRoot()));
			ArrayList<String> list = new ArrayList<String>();
			Map<String, Integer> family = new HashMap<String, Integer>();
			
			getChildren(list, event.getFacesContext().getViewRoot());		
			getFamilies(family, event.getFacesContext().getViewRoot());

			for(int i = 0; i < list.size(); i++){
				if(family.containsKey(list.get(i)))
					family.put(list.get(i), family.get(list.get(i)) + 1);
			}
			
			for(Map.Entry<String, Integer> entry : family.entrySet()){
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			family.clear();
			list.clear();
		}
	}
	
	public int getChildCount(UIComponent component)
	{
		int count = 1;
		for(UIComponent child: component.getChildren()){
			count = count + getChildCount(child);
		}
		return count;
	}
	public void getChildren(ArrayList<String> list,  UIComponent component)
	{
		list.add(component.getFamily());
		//System.out.println(component.getFamily() + ": " + component.getId() + ", Kinder: "
		//		+ component.getChildCount());
		for(UIComponent child: component.getChildren()){
			getChildren(list, child);
		}
	}
	public void getFamilies(Map<String, Integer> family, UIComponent component)
	{
		if(!family.containsKey(component.getFamily())) {
			family.put(component.getFamily(), 0);
		}
		for(UIComponent child: component.getChildren()) {
			getFamilies(family, child);
		}
	}


	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}

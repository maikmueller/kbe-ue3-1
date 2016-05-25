package de.htw_berlin.ai_bachelor.kbe.checklist.model;


import javax.faces.context.FacesContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import de.htw_berlin.ai_bachelor.kbe.checklist.mb.PrioIntervalMB;


public class MyIntervalValidator implements ConstraintValidator<MyInterval,Integer> {

	
	
	public void initialize(MyInterval arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(Integer value, ConstraintValidatorContext ctx) {
		FacesContext fc = FacesContext.getCurrentInstance();
		
		PrioIntervalMB prio = (PrioIntervalMB) fc.getApplication().getELResolver().getValue(
		    fc.getELContext(), null, "PrioIntervalMB");
		
		if (value >= prio.getMinValue() && value <= prio.getMaxValue()) {
			return true;
		}
		    
		return false;
	}

}

package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyFutureDateValidator implements ConstraintValidator<FutureDate,Date> {

	public void initialize(FutureDate arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(Date date, ConstraintValidatorContext arg1) {
		if (date.getTime() > (new Date()).getTime() )
			return true;
		else
			return false;
	}

}

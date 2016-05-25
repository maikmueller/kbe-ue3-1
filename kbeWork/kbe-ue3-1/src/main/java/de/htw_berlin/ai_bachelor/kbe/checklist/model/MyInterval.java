package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = MyIntervalValidator.class)

public @interface MyInterval {
	
	String message() default "Der Wert liegt nicht im erlaubten Bereich.";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
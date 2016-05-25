package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = MyFutureDateValidator.class)

public @interface FutureDate {
	//String message() default "Das Fälligkeitsdatum muss in der Zukunft liegen";
	String message() default "{de.htw_berlin.ai_bachelor.kbe.checklist.messages_de}";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}

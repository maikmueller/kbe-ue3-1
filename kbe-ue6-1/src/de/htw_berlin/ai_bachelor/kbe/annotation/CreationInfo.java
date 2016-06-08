package de.htw_berlin.ai_bachelor.kbe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface CreationInfo {
	String author() default "Fridtjof Bonneß";
	String description();
	String[] tags() default {};
	Class<?> baseclass() default Object.class;
	Class<?>[] interfaces() default {};
}

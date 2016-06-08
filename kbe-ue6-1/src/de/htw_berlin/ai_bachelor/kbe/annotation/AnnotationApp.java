package de.htw_berlin.ai_bachelor.kbe.annotation;

import java.util.Arrays;

public class AnnotationApp {
	
	public static void main(String[] args) throws Exception 
	{
		CreationInfo creationInfo = Rectangle.class.getAnnotation(CreationInfo.class);
		
		System.out.println(Arrays.toString(Form.class.getMethods()));
		//checkClassType(Rectangle.class.getSuperclass());
		if (creationInfo != null)
			printCreationInfo(creationInfo);
		else
			System.out.println("Keine " + CreationInfo.class.getSimpleName()
					+ " Annotation vorhanden.");
		
	}
	
	
	public static void printCreationInfo(CreationInfo cf)
	{
		System.out.println("author: " + cf.author());
		System.out.println("description: " + cf.description());
		System.out.println("tags: " + Arrays.toString(cf.tags()));
		System.out.println("baseclass: " + cf.baseclass());
		System.out.println("interfaces: " + Arrays.toString(cf.interfaces()));
	}
	
	static void checkClassType(Class<?> c)
	{
	    if (c.isArray())
	    	System.out.println(c.getName() + " ist ein Feld.");
	    else if (c.isPrimitive())
	    	System.out.println(c + " ist ein primitiver Typ.");
	    else if (c.isInterface())
	    	System.out.println(c.getName() + " ist ein Interface.");
	    else
	    	System.out.println(c.getName() + " ist eine Klasse.");
	
	}

}

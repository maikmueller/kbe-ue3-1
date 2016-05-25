package de.htw_berlin.ai_bachelor.kbe.tree;

import java.util.ArrayList;
import java.util.Collection;

public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> test = new Tree<Integer>(1,new Tree<Integer>(23, null, null), new Tree<Integer>(42, null, new Tree<Integer>(65, null, null)));
		System.out.println(export(test));
		
		System.out.println("" + TreeSum.sum(test));
		
		ComparePredicate<Integer> compare = new ComparePredicate<>(20, 50);
		Collection<Integer> collect = filterElements(compare, test);
		System.out.println("FILTERR");
		for(Integer o : collect){
			System.out.println(" "+o);
		}
		
	}
	
	public static String export(Tree<?> baum){
		String str = "";
		if (baum != null) {
			str = baum.getValue() + " " + export(baum.getLeft()) + export(baum.getRight());
		}
		return str;
	}
	
	public static <V extends Comparable<V>> Collection<V> filterElements(ComparePredicate<V> compare, Tree<V> tree){
		Collection<V> elements = new ArrayList<>();
		if(compare.isOK(tree))
			elements.add(tree.getValue());
		
		if(tree.getLeft()!= null)
			elements.addAll(filterElements(compare, tree.getLeft()));
		if(tree.getRight()!= null)
			elements.addAll(filterElements(compare, tree.getRight()));
		return elements;
	}
		
}

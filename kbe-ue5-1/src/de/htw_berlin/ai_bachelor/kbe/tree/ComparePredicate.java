package de.htw_berlin.ai_bachelor.kbe.tree;

public class ComparePredicate<V extends Comparable<V>> implements TreePredicate<V>{
	V maxEle,minEle;
	
	public ComparePredicate(V min, V max){
		maxEle = max;
		minEle = min;
	}
	
	@Override
	public boolean isOK(Tree<V> tree) {
		if(tree.getValue().compareTo(maxEle) < 0  && tree.getValue().compareTo(minEle) > 0){ 
		
			// wenn tree.getValue() kleiner als maxEle ist, wird ein negativer Int Wert zurückgegeben, 
			// wenn tree.getValue() größer als minEle ist, wird ein positiver Wert zurückgegeben
			// wenn beide Werte gleich maxEle oder minEle sind, wird 0 zurückgegeben
			
			return true;
		}else{
			return false;
		}
	}

}
 
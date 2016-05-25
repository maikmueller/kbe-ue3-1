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
			return true;
		}else{
			return false;
		}
	}

}

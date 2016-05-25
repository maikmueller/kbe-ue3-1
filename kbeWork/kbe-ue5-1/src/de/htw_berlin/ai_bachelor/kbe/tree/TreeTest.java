package de.htw_berlin.ai_bachelor.kbe.tree;


public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> t1 = new Tree<Integer>(1, null, null);
		Tree<Integer> t2 = new Tree<Integer>(23, null, null);
		Tree<Integer> t3 = new Tree<Integer>(42, t1, null);
		Tree<Integer> t4 = new Tree<Integer>(65, t3, t2);

		System.out.println(export2(t4));
		System.out.println(export3(t4));
		System.out.println(TreeSum.sum(t4));
	}
	
	public static String export(Tree<?> tree) {
		return "" + tree.getValue() + " " + tree.getLeft().getValue()
				+ " " + tree.getRight().getValue();
	}
	
	public static String export2(Tree<?> t) {
		if (t != null) {
			return  t.getValue() + " l:" + export2(t.getLeft())
					+ " r:" + export2(t.getRight());
		}
		else {
			return "null";
		}
		
	}
	
	public static String export3(Tree<?> t) {
		String s;
		if (t != null) {
			s =  t.getValue() + " l:" + t.getLeft().getValue()
					+ " r:" + t.getRight().getValue() + "\n";
			s = s + export3(t.getLeft());
		}
		else {
			s = "null";
		}
		
		return s;
		
	}
		
}
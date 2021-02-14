package CollectionFrameWorkProg;

import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<>();

		int x[] = { 10, 20, 30, 40 };

		for (int i = 0; i < x.length; i++) {
			v.add(x[i]);

		}

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("Vector elements:");

		ListIterator lit = v.listIterator();

		System.out.println("Forward direction");
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("Backward Dirction");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}

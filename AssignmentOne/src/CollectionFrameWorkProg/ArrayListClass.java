package CollectionFrameWorkProg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1 = new ArrayList<>();

		ar1.add("Apple");
		ar1.add("Mango");
		ar1.add("Grapes");
		ar1.add("Guava");

		System.out.println("contents:" + ar1);
		System.out.println("Size:" + ar1.size());

		Iterator it = ar1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(ar1.contains("Mango"));
	
	}

}

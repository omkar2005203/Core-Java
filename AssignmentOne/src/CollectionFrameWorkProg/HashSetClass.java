package CollectionFrameWorkProg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("India");
		hs.add("USA");
		hs.add("Sri Lanks");
		hs.add("Dubai");
		hs.add("Malaysia");
		
		
		
		
		Iterator it = new  hs.iterator();
		//System.out.println(it);
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
		
		

	}

}

package CollectionFrameWorkProg;

import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StackOp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();

		int choice = 0, position, element;

		while (choice < 4) {
			System.out.println("Choose Option for stack operation:");
			System.out.println("1:Push an element");
			System.out.println("2:Pop an element");
			System.out.println("3:Search an element");
			System.out.println("4:Display element in stack");
			System.out.println("5:Exit");
			choice = scan.nextInt();
			java.util.Iterator<Integer> it = st.iterator();

			switch (choice) {
			case 1:
				System.out.println("Enter element for push operation:");
				element = scan.nextInt();
				st.push(element);
				break;

			case 2:
				Integer obj = st.pop();
				System.out.println("poped:" + " " + obj);
				break;
			case 3:
				System.out.println("Which element?");
				position = scan.nextInt();
				int result = st.search(position);
				if (result == -1) {
					System.out.println("Element not found at position" + position);
				}
				break;
			case 4:
				System.out.println("Element in stack are as follows:");
				while (it.hasNext()) {
					int t = (Integer) it.next();
					System.out.println(t);
				}
				break;
			case 5:
				System.exit(0);
				break;

			default:
				return;
			}

		}

	}

}

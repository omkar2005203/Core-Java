package OneToEight;

import java.util.Scanner;

// main class for testing all codes

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		
		
		
		
		
		
		
//Java Assignment - 3		
		
		System.out.println("Enter num 1:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println("Enter num 2:");
		Scanner e = new Scanner(System.in);
		int b = e.nextInt();
	
		System.out.println("The sum of "+a+" and "+b+" is: "+c.add(a, b));
		System.out.println("The mul of "+a+" and "+b+" is: "+c.mul(a, b));
		System.out.println("The sub of "+a+" and "+b+" is: "+c.sub(a, b));
		System.out.println("The divide of "+a+" and "+b+" is: "+c.div(a, b));
		
		

	}

}

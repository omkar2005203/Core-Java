/**
 * Java Assignment - 4
 * Create a class NumberUtil with two methods
 1. to return the product of two numbers
 2. to return square root of a number Math.sqrt(a)  a is double
Take input from keyboard : use Scanner class and pass values to methods above. Print the results from each method
 * 
 */

package OneToEight;

import java.util.Scanner;

public class NumberUtil {
	
	public double product(int numOne,int numTwo) {
		return numOne*numTwo;
	}
	
	public double mysqrt(int num) {
		return Math.sqrt(num);
	}

	
	
// test main method 
	
//	public static void main(String[] args) {
//		
//		NumberUtil n = new  NumberUtil();
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter num one:");
//		
//		int numOne = scan.nextInt();
//		
//		
//		System.out.println("Enter num one:");
//		
//		int numTwo = scan.nextInt();
//		
//		System.out.println("Enter number for square root:");
//		int numSqrt=scan.nextInt();
//		
//		System.out.println("Product of two numbers:"+" "+numOne+" "+"and"+" "+numTwo+" "+"is:"+" "+n.product(numOne, numTwo));
//		
//		System.out.println("Square Root of number:"+numSqrt+" "+"is:"+" "+n.mysqrt(numSqrt));
//		
//		
//		
//
//	}

}

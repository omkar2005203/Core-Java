/**
 * Java Assignment - 8
Create a class SumAtPrime. Create a method getSumAtPrime which takes an int array as parameter.
The sum of all numbers in the array at indexes which are prime numbers should be returned by this method.
Prime number is a natural number greater than 1 and which is divisible by 1 and itself only.
viz 2,3,5,7,11,13,...
For example :
For int array   {1,2,10,4,5,6,7,8,9,10,11,12,13,14} 
                              |  |     |     |                |         |
                             2  3    5    7              11      13
we need to add   10+4+ 6+  8+            12+    14 as they are in prime locations.
 * 
 */
package OneToEight;

public class GetSumPrimeIndex {

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;
		{
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}

			}

		}
		// Check from 2 to n-1

		return true;

	}

	public void getSumPrimeInde(int arr[]) {
		int n = arr.length;
		int sum = 0;
		// index prime or not
		System.out.println("Elements in array at prime index are :");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				sum += arr[i - 1];
				System.out.println(arr[i - 1]);
			}
		}
		System.out.println("");
		System.out.println("sum of prime index is :" + sum);
	}

//main method to test

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		GetSumPrimeIndex i = new GetSumPrimeIndex();
//
//		int[] intArray = { 1, 2, 10, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
//
//		i.getSumPrimeInde(intArray);
//
//	}

}

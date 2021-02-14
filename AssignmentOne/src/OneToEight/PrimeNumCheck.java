/**
 /* *Java Assignment - 7

Create a method to check if a number is a prime number and return true or false

(A number is  prime if it is divisible by 1 and itself only)

 * 
 */


package OneToEight;

public class PrimeNumCheck {
	
	public boolean primeCheckNum(int num) {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {

	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	    {
	       return true;
	     }
	    else {
	    	 return false;
	    }
	}

// unit test main method	
	
//	public static void main(String[] args) {
//	
//		PrimeNumCheck g = new PrimeNumCheck();
//		
//		System.out.println(g.primeCheckNum(29));
//		
//	}

}

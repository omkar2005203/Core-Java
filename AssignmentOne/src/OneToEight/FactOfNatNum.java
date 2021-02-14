package OneToEight;

public class FactOfNatNum {
	
	public void factNatNum(int start,int end) {
		// natural number
		for(int i=start;i<=end;i++) { 
	        int factorial = 1;
	     // factorial calculation
	        for(int j = 1; j <= i; ++j) 
	        {
	            factorial *= j;
	        }
	        System.out.println("Factorial of "+" "+i+" "+"is:"+""+factorial);
	    }
	}
		
		
		 

//
//	public static void main(String[] args) {
//		
//      FactOfNatNum k = new FactOfNatNum();
//      k.factNatNum(1, 10);
//	}

}

/**
 * *Java Assignment - 1

       Create a program to print stars : * in a pyramid form
        Increase by one * till half of rows and 
              then by two ** for rest of rows
 * 
 */
package OneToEight;
public class Pyramid {
	public void pyramid(int space,int max) {
		int i,j;
	    
	    /*run loop (parent loop) till number of rows*/
	    for(i=0;i< max;i++)
	    {
		    /*loop for initially space, before star printing*/
		    for(j=0;j< space;j++)
		    {
			    System.out.print(" ");
		    }
		    for(j=0;j<=i;j++)
		    {
			    System.out.print("* ");
		    }
			
		    System.out.println("");
		    space -- ;	/* decrement one space after one row*/
	    }
	}
	public static void main(String[] args) {
		
		Pyramid p = new Pyramid();
		p.pyramid(4, 5);
		
	}

}

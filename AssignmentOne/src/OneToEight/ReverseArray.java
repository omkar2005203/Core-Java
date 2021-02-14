/**
 * *Java Assignment - 5


Declare an array of characters.

char [] cArr = { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };

Display the characters in reverse order
 */
package OneToEight;

public class ReverseArray {

	static void reverse(char a[], int n) 
    { 
        char[] b = new char[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
   
        char [] arr = { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
        reverse(arr, arr.length); 
    } 
}

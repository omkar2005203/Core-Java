/**
 * Java Assignment - 2

In a for loop of a set of natural numbers 1 to 50,print 'abc' if it is divisible by 3,
print 'xyz' if it is divisible by 5, and 'abcxyz' if divisible by both 3 and 5, else print the number itself
Output will be like :
1 2 abc 4 xyz abc 7 8 abc xyz 11 abc 13 14 abcxyz 16 .....

 */
package OneToEight;

public class NaturalNum {
	
	public void naturalnum(int start,int end) {
		for(int i=start;i<=end;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.print(i+"\t");
				if(i==48) {
					System.out.println("abc");
				}
			}
	
			else if(i%5==0) {
				System.out.print(i+"\t");
				if(i==50) {
					System.out.println("xyz");
				   }
			}
			
			if(i%3==0 && i%5==0) {
				System.out.print(i+"\t");
				if(i==45) {
					System.out.println("abcxyz");
				}
			}
		
			
		}
	}

	public static void main(String[] args) {
		NaturalNum j = new NaturalNum();
		j.naturalnum(1, 50);
	}

}

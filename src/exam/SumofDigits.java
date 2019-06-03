
package exam;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,temp, s=0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			//n=n%10;
			
			s=s+n%10;
			n=n/10;
			
		}
		System.out.println(s);
		
}
}


package exam;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,temp, s=0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s+(r*r*r);
			
		}
	
		if(temp==s) {
			System.out.println("number is Armstrong");
		}else {
			System.out.println("number is not Armstrong");
		}
}
}
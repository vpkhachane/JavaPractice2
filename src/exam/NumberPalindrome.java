

package exam;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,temp, s=0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		System.out.println(s);
		if(temp==s) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
}
}

//Prime Number  Print 
package exam;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int mid=n/2;
		if(n==0||n==1) {
			System.out.println("Not Prime");
		}else {
			
			for(int i=2;i<=mid;i++) {
				if(n%i==0) {
					System.out.println("Not Prime");
					flag= 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n +" Number is Prime");
			}
		}
		
}
}
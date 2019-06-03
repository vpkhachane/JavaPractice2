package demo;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				//System.out.print("* ");
				if(i%2 != 0) {
					System.out.print((char)(j+64)+ " ");
				}
				else
				{
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		}
	}
}
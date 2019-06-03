package demo;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				//System.out.print("* ");
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
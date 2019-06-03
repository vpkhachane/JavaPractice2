package demo;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=n;j-- ) {
				//System.out.print("* ");
				//System.out.print(i+ "5 ");
				//System.out.print(j+ " ");
				//System.out.print((char)(i+64)+ " ");
				System.out.print((char)(j+64)+ " ");
			}
			System.out.println();
				
			}
	}	
	}
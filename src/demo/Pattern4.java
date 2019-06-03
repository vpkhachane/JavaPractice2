package demo;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j-- ) {
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
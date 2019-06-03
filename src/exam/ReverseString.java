package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String org=reader.readLine();
		System.out.println("Original String is " +org);
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("Reverse string is-"+rev);
		
	}

}

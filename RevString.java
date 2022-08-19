package in.ineuron.main;
import java.util.*;
//WAP to reverse a String
public class RevString {
	public static void main(String[] args) {
	
		String original; // for storing user input
		String rev = "";	// for storing reverse of string 
		// input from user
		System.out.println("Enter string to reverse :");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();

		
		int len = original.length();
		
		for(int i=len-1;i>=0;i--)
		rev = rev + original.charAt(i);
		// print both the string objects
		System.out.println("Original string is : " +original);
		System.out.println("Reversed string is : " +rev);
		
		sc.close();
	}

}

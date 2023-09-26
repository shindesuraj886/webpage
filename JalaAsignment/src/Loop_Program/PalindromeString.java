package Loop_Program;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String");
	String rev="";
	String str=sc.next();
	String org_str=str;
	//String size=str.length();
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	if(org_str.equals(rev)) {
		System.out.println("is palindrome"+org_str);
	}else {
		System.out.println("is not palindrome"+org_str);
	}
	
}
}
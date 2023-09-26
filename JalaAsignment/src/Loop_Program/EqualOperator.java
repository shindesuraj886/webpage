package Loop_Program;

public class EqualOperator {
	//. Program to equal operator and not equal operator

public static void main(String[] args) {
	
	
	String s1="you";
	String s2="you";
	String s3=new String("you");
	
	System.out.println(s1==s2);//true
	
	System.out.println(s1==s3);//fals
	System.out.println(s1.equals(s2));//tryue

	System.out.println(s1.equals(s3));//true
	
}}

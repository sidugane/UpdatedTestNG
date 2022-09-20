package Test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
System.out.println("Enter your string");		
	//Palindrome String	
	Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is palindrome string");
		}
		else
		{
			System.out.println(org_str+" is not a palindrome string");
		}
	}

}

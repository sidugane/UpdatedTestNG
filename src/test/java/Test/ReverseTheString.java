package Test;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		String rev="";
		System.out.println("Enter Your String Value");
		Scanner val2=new Scanner(System.in);
		String str1=val2.next();
		
		int len=str1.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println("The Second Reverse String is :"+rev);
	}

}

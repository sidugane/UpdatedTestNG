package Test;

import java.util.Scanner;

public class ReverserNumber {

	public static void main(String[] args) {
		
		//int num=123;
		String rev="";
		//String str="Sidharth";
		System.out.println("Enter Your Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		
		System.out.println("Enter Your String Value");
		Scanner sc1=new Scanner(System.in);
		String str=sc1.nextLine();
				
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1.reverse());
		
		System.out.println("Enter Your 2nd String Value");
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

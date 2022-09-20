package Test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		int rev=0; //Palindrome number
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Palindrome number" +org_num);
		}
		
		else
		{
			System.out.println("The number is not palindrome "+org_num);
		}
	}

}

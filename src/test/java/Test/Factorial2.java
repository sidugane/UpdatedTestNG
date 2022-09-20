package Test;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
			
		int fact=1; //Factorial of given number
		
		for(int i=number; i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("The factor of given number: "+number+" is: "+fact);

	}

}

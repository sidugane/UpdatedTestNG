package Test;

import java.util.Scanner;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The given number is Even :"+num);
		}
		else
		{
			System.out.println("The given number is Odd :"+num);
		}
		

	}

}

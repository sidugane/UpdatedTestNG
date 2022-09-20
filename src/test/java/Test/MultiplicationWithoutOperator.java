package Test;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) {
	
		System.out.println("Enter your first number...");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		System.out.println("Enter your second number...");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=num2; i++)
		{
			sum=sum+num1;
		}

		System.out.println("The Mulitiplication of the two numbrers is :"+sum);

	}

}

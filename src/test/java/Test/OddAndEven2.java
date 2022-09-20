package Test;

import java.util.Scanner;

public class OddAndEven2 {

	public static void main(String[] args) {

 System.out.println("Ente your number");
 Scanner sc=new Scanner(System.in);
 
int num=sc.nextInt();

if(num%2==0)  //Odd and Even numbers
{
	System.out.println("The given number "+num+" is Even");
}
else
{
	System.out.println("The given number "+num+" is Odd");
}
	}

}

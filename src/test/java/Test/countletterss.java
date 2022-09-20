package Test;
import java.util.Scanner;
public class countletterss 
{

	public static void main(String[] args) {
		
		
		System.out.println("Enter your String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int a=0;
		int b=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(ch>=65&& ch<=90)
		{
			a++;
		}
		
		else
		{
			b++;
		}
		}
		
		System.out.println("Capital letters in given string is :" +a);
		System.out.println("Small letters in given string is :" +b);
	}
	
	
	
}

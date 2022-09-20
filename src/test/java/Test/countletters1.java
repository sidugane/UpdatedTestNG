package Test;
import java.util.Scanner;
public class countletters1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your string");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int a=0;
		int b=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 & ch<=90)
			{
				a++;
			}
			else
			{
				b++;
			}
		}
		
		System.out.println("The Capital letters from the string is :"+a);
		System.out.println("The small letters from the string is :"+b);
	}
}

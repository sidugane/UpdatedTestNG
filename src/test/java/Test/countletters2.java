package Test;
import java.util.Scanner;
public class countletters2 
{

	public static void main(String[] args) {
		
		System.out.println("Enter your fevourite string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int a=0;
		int b=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch>=65 && ch<=90)
			{
				a++;
			}
			else
			{
				b++;
			}
		}
		
		System.out.println("Capital Letters Presents in String :"+s+"  is "+a);
		System.out.println("Small Letters Presents in String :"+s+"  is "+b);
		
		System.out.println("");
		System.out.println("Enter your 1 number");
		int x=sc.nextInt();
		System.out.println("Enter your 2 number");
		int y=sc.nextInt();
		
		int c=x>y? x:y;
		System.out.println("The gretest value is :"+c);
				
	}
	
	
}

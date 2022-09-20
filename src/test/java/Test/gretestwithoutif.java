package Test;
//Check greatest number without using If statement
public class gretestwithoutif 
{
public static void main(String[] args) 
{
	int a=10;
	int b=20;
	int c=a>b? a:b;
	System.out.println("The largest number is :"+c);
	
	System.out.println("");
	System.out.println("-----COUNT SMALL & CAPITAL LETTERS---");
	String s="SIDHARTH Nagorao Dugane";
	int x=0;
	int y=0;
	
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
		x++;
			
		}
		
		else
		{
			y++;
			
		}
		
	}
	
	System.out.println("The Capital Letters in String is : "+x);
	System.out.println("The Small Letters in String is : "+y);
}
}

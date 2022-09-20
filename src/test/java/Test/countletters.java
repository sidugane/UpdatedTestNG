package Test;

public class countletters 
{
public static void main(String[] args)
{
	//Count Letters from the string
	String s="This is Sidharth Dugane ";
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

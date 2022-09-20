package Test;

public class Forloop
{
public static void main(String[] args) 
{
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}

	System.out.println("---------NEW LOOP-----------");
	Forloop f=new Forloop();
	f.x();
	
}
	
	public void x()
	{
		for(int k=1;k<=10;k++)
		{
			for(int l=1;l<=k;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

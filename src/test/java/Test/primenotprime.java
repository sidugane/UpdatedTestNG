package Test;

public class primenotprime {

	public static void main(String[] args) {
		
		
		int x=7;
		int count=0;
		
		if(x>1)
		{
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
				count++;
				}
				
			}
			
			if(count==2)
			{
				System.out.println("The number is prime "+x);
			}
			else
			{
				System.out.println("The number is not prime "+x);
			}
		}
		else
		{
			System.out.println("The number is not prime "+x);	
		}

	}

}

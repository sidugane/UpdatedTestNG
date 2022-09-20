package Test;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num = 100;
	    boolean checker = false;
	    for (int i = 2; i <= num / 2; ++i)
	    {
	    	//check for non prime numbers
	      if (num % i == 0)
	      {
	       checker = true;
	        break;
	      }
	    }

	    if (!checker)
	    {
	      System.out.println(num + " is a prime number.");
	    }
	    else
	    {
	      System.out.println(num + " is not a prime number.");
	    }

	}

}

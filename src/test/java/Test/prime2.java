package Test;

public class prime2 {

	//Check number is prime or not
	public static void main(String[] args)
	{
		int num = 100;
	  
	    for (int i = 2; i <= num / 2; ++i)
	    {
	      if (num % i == 0)
	      {
	      
	    	  System.out.println("The given number is Prime : "+num);
	    	  break;
	      }
	      else
		    {
		      System.out.println("The given number is not prime number :"+num);
		      break;
		    }

	    }
	}

}

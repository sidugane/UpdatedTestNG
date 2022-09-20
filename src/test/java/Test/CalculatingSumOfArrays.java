package Test;

public class CalculatingSumOfArrays
{
public static void main(String[] args) {

	// Calculate Sum of Arrays
int a[]= {1,2,3,4};
	
	int sum=0;
	
	for(int i:a)
	{
		sum=sum+i;
	}
	
	System.out.println("The Sum Of Array Is :"+sum);
	
	
	int sum1=0;
	int b[]= {10,20,30,40};
	for(int z:b)
	{
		sum1=sum1+z;
	}
	System.out.println("The Sum Of Array Is :"+sum1);
}
	
}

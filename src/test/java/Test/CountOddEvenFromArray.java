package Test;

//Count Odd and Even Numbers from string as well as Sum for given arrays
public class CountOddEvenFromArray 
{
public static void main(String[] args)
{
int []a= {1,2,3,4,5,6,7,8,9};

int even=0;
int odd=0;

for(int i=0;i<a.length;i++)
{
	if(a[i]%2==0)
	{
		even++;
	}
	
	else
	{
		odd++;
	}
}
System.out.println("Even numbers are "+even);
System.out.println("Odd numbers are "+odd);

System.out.println("");
System.out.println("_______CALCULATING SUM OF ARRAY_____");

int sum=0;
for(int j:a)
{
	sum=sum+j;
}

System.out.println("The Sum of Array is :"+sum);
}
}

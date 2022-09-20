package Test;

public class swapnum 
{
public static void main(String[] args) 
{
	
	int a = 100;
	int b = 200;
	swapNumbers(a, b);
	System.out.printf("a is %d, b is %d", a, b);	
}

public static void swapNumbers(int a, int b) 
{
    b = b + a;
	a = b - a;
	b = b - a;
}
}

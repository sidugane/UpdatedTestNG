package Test;
import java.util.Scanner;
public class SumOfArray2 {

	public static void main(String[] args) {
	int x1[]= {1,2,3,4,5,5,5};
	
	int sum=0;
	for(int i:x1)
	{
		sum=sum+i;
	}
System.out.println(sum);



System.out.println("Enter values of x and y");
Scanner sc=new Scanner(System.in);

int x=sc.nextInt();
int y=sc.nextInt();

x=x+y;
y=x-y;
x=x-y;

System.out.println("X :"+x+" Y :"+y);
//x = x + y;   
//y = x - y;   
//x = x - y;   
	}

}

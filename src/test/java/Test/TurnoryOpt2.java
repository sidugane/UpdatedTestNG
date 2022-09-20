package Test;

public class TurnoryOpt2
{
public static void main(String[] args)
{
	//Check greatest numbers using ternary operator-Example 2
	// variable declaration
    int n1 = 556, n2 = 56, res;

    System.out.println("First num: " + n1);
    System.out.println("Second num: " + n2);

    // Performing ternary operation
    res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

    // Print the largest number
    System.out.println("Result = " + res);
}
}

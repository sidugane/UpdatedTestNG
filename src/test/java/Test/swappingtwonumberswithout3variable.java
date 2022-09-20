package Test;
import java.util.Scanner;
import com.sun.tools.javac.Main;

public class swappingtwonumberswithout3variable {
public static void main(String[] args) {
	System.out.println("Enter the value of x and y");  
    Scanner sc = new Scanner(System.in);  
    /*Define variables*/  
    int x = sc.nextInt();  
    int y = sc.nextInt();  
    System.out.println("Before swapping numbers: "+x +" "+ y);  
   /*Swapping*/  
    x = x + y;   
    y = x - y;   
    x = x - y;   
    System.out.println("After swapping: "+x +"  " + y);   
}
}

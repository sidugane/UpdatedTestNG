package Test;

public class Split {

	public static void main(String[] args) {

String s1="Sidharth Dugane";
String s2="ABC";
String s3="abc";
String s4="My Name is Sidharth Dugane";
System.out.println(s1);

System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.contains("Sid"));
System.out.println(s1.equals(s2));
System.out.println(s4.length());
System.out.println(s2.equalsIgnoreCase(s3));
System.out.println("");
System.out.println("Swapping two numbers");
int x=10;
int y=20;

x=x+y;
y=x-y;
x=x-y;
System.out.println("The value of x is :"+x);
System.out.println("The value of y is :"+y);

	}

}

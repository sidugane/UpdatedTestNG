package Test;

public class ReverserString {

	public static void main(String[] args) {


		String s="Sidharth";
		String rev=""; //Reverse String
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev); 
	}}

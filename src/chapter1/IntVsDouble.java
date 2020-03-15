package chapter1;

public class IntVsDouble {
	public static void main(String args[]) {
		int var;
		double x;
		
		var = 10;
		x = 10.0;
		
		System.out.println("Original value of var : " + var);
		System.out.println("ORiginal value of x : " + x);
		
		var = var/4;
		x = x/4;
		
		System.out.println("var	after division : " + var);
		System.out.println("x after division : " + x);		
	}
}

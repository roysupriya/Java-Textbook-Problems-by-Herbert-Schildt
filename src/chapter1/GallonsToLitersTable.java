package chapter1;

public class GallonsToLitersTable {
	public static void main (String args[]) {
		double gallons, liters;
		int count = 0;
		
		for(gallons = 1.0; gallons<=100; gallons++) {
			
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallongs is " + liters + " liters");
			
			if(++count==10) {
				count = 0;
				System.out.println();
			}			
		}
	}
}

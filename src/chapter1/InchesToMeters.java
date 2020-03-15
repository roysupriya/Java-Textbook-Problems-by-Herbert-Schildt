package chapter1;

public class InchesToMeters {
	public static void main(String args[]) {
		double inches, meters;
		int count = 0;
		
		for(inches = 1; inches <= (12*12); inches++) {
			System.out.println(inches + " inches is " + inches/39.37 + " meters");
			
			if(++count == 12) {
				count = 0;
				System.out.println();
			}
		}
	}
}

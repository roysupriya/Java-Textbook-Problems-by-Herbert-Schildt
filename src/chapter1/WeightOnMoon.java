package chapter1;

public class WeightOnMoon {
	public static void main (String args[]) {
		double gravityOnMoon, gravityOnEarth;
		
		gravityOnEarth = 56.4;
		gravityOnMoon = gravityOnEarth * 0.17;
		
		System.out.println("If weight on earth is : " + gravityOnEarth + "Kg, "
				+ "weight on moon is : " + gravityOnMoon + "Kg");
	}
}

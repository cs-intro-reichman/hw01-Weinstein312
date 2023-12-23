/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int lb = Integer.parseInt(args[0]); // Lower Bound
		int ub = Integer.parseInt(args[1]); // Upper Bound

		// Generate 3 random numbers between the Lower Bound and Upper Bound by multiplying a random decimal 0-1 by the range
		// and adding to the Lower Bound. They are casted to be integers.
		int randInt = (int) (lb + (Math.random() * (ub - lb)));
		int randInt2 = (int) (lb + (Math.random() * (ub - lb)));
		int randInt3 = (int) (lb + (Math.random() * (ub - lb)));

		int min = Math.min(randInt, Math.min(randInt2, randInt3));

		System.out.println(randInt);
		System.out.println(randInt2);
		System.out.println(randInt3);

		System.out.println("The minimal generated number was " + min);
	}
}

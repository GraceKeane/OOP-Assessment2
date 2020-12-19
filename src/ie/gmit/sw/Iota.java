package ie.gmit.sw;

/**
 * Client class.
 * Prints out simple results to demonstrate the use of the visitor
 * pattern performed on Beta, Gamma, Zeta and Epsilon.
 * 
 * Iota does not know about any methods in Delta or Alpha.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020 
 * 
 */
public class Iota {

	public static void main(String[] args) {
		System.out.println("Client class");
		
		Beta b = new Beta(1.00);
		System.out.println("Beta " + "is located at " + b);
		Gamma g = new Gamma(2.00);
		System.out.println("Gamma " + "is located at " + g);
		Zeta z = new Zeta(3.00);
		System.out.println("Beta " + "is located at " + z);
		Epsilon e = new Epsilon(4.00);
		System.out.println("Gamma " + "is located at " + e);

	}
}

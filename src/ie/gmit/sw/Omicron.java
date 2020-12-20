package ie.gmit.sw;

/**
 * Omicron symbolizes the Visitable class.
 * Omicron allows Omega to pass the object so the right
 * operations occur on the right type of object.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 */
public interface Omicron {
	
	/**
	 * accept() is passed the same Omega object
	 * but then the method visit() is called using
	 * the Omega object. The right version of visit()
	 * is called because of method overloading.
	 * 
	 * @param omega
	 */
	public double accept(Omega omega);
	
}

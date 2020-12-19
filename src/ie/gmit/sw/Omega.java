package ie.gmit.sw;

/**
 * Omega symbolizes the Visitor class.
 * The visitor pattern is used when you have to 
 * perform the same action on many objects of 
 * differant types.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public interface Omega {
	
	 /*
	  * Created to automatically use the right
	  * code based on the object sent.
	  * 
	  * Method Overloading.
	  */
	 public double visitBeta(Beta beta);
	 public double visitGamma(Gamma gamma);
	 public double visitEpsilon(Epsilon epsilon);
	 public double visitZeta(Zeta zeta);

}

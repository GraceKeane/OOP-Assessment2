package ie.gmit.sw;

/**
 * Class Epsilon implements Omicron which acts as my visitable.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020 
 * 
 */
public class Epsilon implements Omicron{

	/**
	 * Method that takes in an int and returns an int.
	 * 
	 * @param i
	 */
	public int epsilon(int i) {
		return i & 0xFF000000;
	}
	
	private double greekNum;
	
	// Assigning the value of n to be greekNum.
    Epsilon(double n) {
    	greekNum = n;
    }

    /**
     * Visitor asks node to accept it.
     * Then returns the correct instance of visitor for Epsilon.
     * 
     * @param visitor
     */
    public double accept(Omega visitor) {
        return visitor.visitEpsilon(this);
    }
    
    // Get greekNum and return the greekNum.
    public double getGreekNum() {
        return greekNum;
    }

	public double visit(Beta beta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
package ie.gmit.sw;

/**
 * Class Gamma implements Omicron which acts as my visitable.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020 
 * 
 */
public class Gamma implements Omicron{
		
	/**
	 * Method that takes in a byte and returns an byte.
	 * 
	 * @param b 
	 */
	public byte gamma(byte b) {		
		return (byte) (Integer.reverse(b));
	}
	
	private double greekNum;

	// Assigning the value of n to be greekNum.
    Gamma(double n) {
    	greekNum = n;
    }
    
    /**
     * Visitor asks node to accept it.
     * Then returns the correct instance of visitor for Gamma.
     * 
     *  @param visitor
     */
    public double accept(Omega visitor) {
        return visitor.visitGamma(this);
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
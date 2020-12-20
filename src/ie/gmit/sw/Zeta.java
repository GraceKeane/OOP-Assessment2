package ie.gmit.sw;

/**
 * Class Zeta implements Omicron which acts as my visitable.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public class Zeta implements Omicron{
	
	/**
	 * Method that takes in an int and returns an int.
	 * 
	 * @param i 
	 */
	public int zeta(int i) {		
		return i & 0x000000FF;
	}
	
	private double greekNum;

	// Assigning the value of n to be greekNum.
    Zeta(double n) {
    	greekNum = n;
    }

    /**
     * Visitor asks node to accept it.
     * Then returns the correct instance of visitor for Zeta.
     * 
     *  @param visitor
     */
    public double accept(Omega visitor) {
        return visitor.visitZeta(this);
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
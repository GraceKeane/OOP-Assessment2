package ie.gmit.sw;

/**
 * Class Beta implements Omicron which acts as my visitable.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020 
 * 
 */
public class Beta implements Omicron{	
	
	private double greekNum;

	/**
	 * Method that takes in a byte and returns a byte.
	 * 
	 * @param b 
	 */
	public byte beta(byte b)  {
		System.out.println("beta class");
		int i = b;
		return (byte) (i ^ 0xFFFFFFFF);
	}

	// Assigning the value of n to be greekNum.
    Beta(double n) {
    	greekNum = n;
    }
    
    /**
     * Visitor asks node to accept it.
     * Then returns the correct instance of visitor for Beta.
     * 
     *  @param visitor
     */
    public double accept(Omega visitor) {
        return visitor.visitBeta(this);
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
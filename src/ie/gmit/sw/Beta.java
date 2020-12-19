package ie.gmit.sw;

import java.util.Iterator;

/**
 * Class Beta.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020 
 * 
 */
public class Beta{	
	
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

    Beta(double n) {
    	greekNum = n;
    }

    public double accept(Omega visitor) {
        return visitor.visitBeta(this);
    }

    public double getGreekNum() {
        return greekNum;
    }

	public double visit(Beta beta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
package ie.gmit.sw;

/**
 * Zeta class.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public class Zeta{
	
	public int zeta(int i) {		
		return i & 0x000000FF;
	}
	
	private double greekNum;

    Zeta(double n) {
    	greekNum = n;
    }

    public double accept(Omega visitor) {
        return visitor.visitZeta(this);
    }

    public double getGreekNum() {
        return greekNum;
    }

	public double visit(Beta beta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
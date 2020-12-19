package ie.gmit.sw;

import java.util.Iterator;

public class Gamma {
			
	public byte gamma(byte b) {		
		return (byte) (Integer.reverse(b));
	}
	
	private double greekNum;

    Gamma(double n) {
    	greekNum = n;
    }

    public double accept(Omega visitor) {
        return visitor.visitGamma(this);
    }

    public double getGreekNum() {
        return greekNum;
    }

	public double visit(Beta beta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
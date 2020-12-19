package ie.gmit.sw;

import java.util.Iterator;

public class Epsilon{

	public int epsilon(int i) {
		return i & 0xFF000000;
	}
	
	private double greekNum;

    Epsilon(double n) {
    	greekNum = n;
    }

    public double accept(Omega visitor) {
        return visitor.visitEpsilon(this);
    }

    public double getGreekNum() {
        return greekNum;
    }

	public double visit(Beta beta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
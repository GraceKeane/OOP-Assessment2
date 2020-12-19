package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Class Alpha is fully encapsulated.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public class Alpha {
	private Status status;
	private int Beta;

	private Alpha(Status status) {
		System.out.println("Alpha");
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
}
	
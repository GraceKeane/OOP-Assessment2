package ie.gmit.sw;

/**
 * Class Alpha is fully encapsulated and has any un-used methods removed.
 * Also removed any stored beta data by deleting the arrays.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public class Alpha {
	private Status status;

	/**
	 * Method Alpha takes in status and returns status.
	 * 
	 * @param status
	 */
	private Alpha(Status status) {
		System.out.println("Alpha");
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
}
	
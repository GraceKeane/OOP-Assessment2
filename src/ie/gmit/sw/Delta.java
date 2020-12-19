package ie.gmit.sw;

/**
 * Method Delta exists as a singleton.
 * 
 * @author Grace Keane
 * @version Java 15
 * @since 18-12-2020
 * 
 */
public class Delta {
	
	// static variable single_instance of type Singleton 
    private static Delta single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    Delta() 
    { 
        s = "String part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Delta getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Delta(); 
  
        return single_instance; 
    }
} 
	
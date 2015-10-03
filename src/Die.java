/* 
 * Name : JihoYoo StudentNumber: 300813612
 */
import java.security.SecureRandom;

public class Die { 
 

 	private int _value; 
 	 
 	public int getValue(){ 
 		return this._value; 
 	} 
 	 
 	
 	
 	public Die(){ 
 		SecureRandom rd = new SecureRandom(); 
 		_value = rd.nextInt(6) + 1; 
 	} 
 } 
package exceptions;

import java.time.LocalTime;
import java.util.Objects;
import java.util.Random;
 
/**
 * Customer service open from 7 to 12 AM
 * @param: String custumerId
 * @throws NullPointerException if custumerID est null
 * @trows CustomerServiceClosedException if method called outside the opening hours
 * @throws CustomerServiceIsFullException if CS is out of resources
 * @author Administrateur
 *
 */

public class CustomerService {
	 public static final int OPENING_HOUR = 7;
	 public static final int CLOSING_HOUR = 16;
 
//	public void call() throws Exception {
	 // on est plus précis en affinant le type d'exception retourné
	 public void call(String customerId) throws CustomerServiceClosedException, CustomerServiceIsFullException {
		/* if (customerId == null) {
			 throw new NullPointerException("The customer Id is not given");
		 }*/
		 // depuis JAVA 8, on peut faire directement
		 Objects.requireNonNull(customerId,"Customer Id must be given");
		 
		LocalTime time = LocalTime.now();
		System.out.println("heure courante "+ time.getHour());
		int currentHour = time.getHour();
		 if ((currentHour < OPENING_HOUR ) || (currentHour >= CLOSING_HOUR )) {
			 throw new CustomerServiceClosedException("Please call tomorow morning");
		 }
		 
		 System.out.println("hello please wait  a while");
		Random rand = new Random();
		if (rand.nextBoolean()) {
			 throw new CustomerServiceIsFullException("Please call tomorow morning");			
		}
		
	}

}

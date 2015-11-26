package exceptions;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		try {
			customerService.call("a023548");
		} catch ( CustomerServiceClosedException e) {
			System.out.println("Merci de nous recontactez ult�rieurement");
		} catch ( CustomerServiceIsFullException e) {
			System.out.println("Merci de patientez ind�finiment");
		} finally {
			System.out.println("ce code est toujours ex�cut�");
		}

	}

}

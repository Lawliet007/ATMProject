import java.util.Scanner;
/**
 * 
 * @author Davka
 *
 */
public class Bank {
	/**
	 * name name of this bank
	 */
	static String name;
	/**
	 * customer's of this bank
	 */
	static String[] customers;
	
	/**
	 * Bank class's construction function
	 * @param name1 bank name string type
	 * @param customers1 bank's customers string array
	 */
	Bank(String name1, String customers1[]){
		name = name1;
		customers = customers1;
	}
	/**
	 * add new customer
	 */
	public static void addCustomer() { 
		Scanner reader = new Scanner(System.in);
		String name = reader.next();
		int customerNumber = reader.nextInt();
		int pin = reader.nextInt();
		int accounts = reader.nextInt();
		Customer newCustomer = new Customer(customerNumber,name,accounts,pin);
	}
	/**
	 * get customer's info. This function return customers information 
	 */
	public static void getCustomer() {

	}
	
	/**
	 * get name
	 * @return name	it returns bank name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set name
	 * @param name	define this bank's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get customers
	 * @return customers	its return this bank's customers
	 */
	public String[] getCustomers() {
		return customers;
	}
	/**
	 * set customers
	 * @param customers	define this bank's customer's
	 */
	public void setCustomers(String[] customers) {
		this.customers = customers;
	}


}

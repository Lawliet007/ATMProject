/**
 * 
 * @author Davka
 *
 */
public class Customer {
	/**
	 * customerNumber this cutomer;s number
	 */
	static int customerNumber;
	/**
	 * name name of this customer
	 */
	static String name;
	/**
	 * accounts this customer's account number
	 */
	static int accounts;
	/**
	 * pin this customer's pin code
	 */
	static int pin;
	/**
	 * 
	 * @param customerNumber1 Customer's number, int type
	 * @param name1  customer's name string type
	 * @param accounts1 customer's account number int type
	 * @param pin1 customer's pin code int type
	 */
	/*
	 * Customer class's construction function
	 */
	Customer(int customerNumber1, String name1, int accounts1,int pin1){
		customerNumber = customerNumber1;
		name = name1;
		accounts = accounts1;
		pin = pin1;
	}
	///public static Customer davka = new Customer(0001,"Davaatseren",1111,1234);
	
	/*
	 * This function gets account's information
	 */
	public static void getAccount() {
		
	}
	/**
	 * get customer number
	 * @return	this customer's number
	 */
	public int getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * set customer number
	 * @param customerNumber	define this customer's number
	 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	/**
	 * get name
	 * @return name	return this customer's name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set name
	 * @param name	define this customer's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get account
	 * @return accounts	return customer's account number
	 */
	public int getAccounts() {
		return accounts;
	}
	/**
	 * set accounts
	 * @param accounts	define customer's account
	 */
	public void setAccounts(int accounts) {
		this.accounts = accounts;
	}
	/**
	 * get pin
	 * @return	customer's pin code
	 */
	public int getPin() {
		return pin;
	}
	/**
	 * set pin
	 * @param pin	define customer's pin code
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

}

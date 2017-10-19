import java.io.Reader;
import java.util.Scanner;
/**
 * 
 * @author Davka
 *
 */
public class ATM {
	/**
	 * bank bank type
	 */
	static Bank bank;
	/**
	 * state current stae of this bank
	 */
	static String state;
	/**
	 * currentCustomer customer type, Current customer of this ATM
	 */
	Customer currentCustomer;
	/**
	 * currentAccount account type, current account of this ATM
	 */
	Account currentAccount;
	static Scanner reader = new Scanner(System.in);
	/**
	 * ATM class's construction function
	 * @param bank1	bank
	 * @param state1	bank's state string type
	 * @param currentAccount1	current's accounts number int type
	 * @param currentCustomer1	current customer's number int type
	 */
	
	ATM(Bank bank1, String state1, Account currentAccount1, Customer currentCustomer1){
		bank = bank1;
		state = state1;
		currentCustomer = currentCustomer1;
		currentAccount = currentAccount1;
	}
	/**
	 * withdraw function
	 */
	public static void withdrawel() {

	}
	
	/**
	 * get bank
	 * @return bank define bank of this ATM connects
	 */
	public Bank getBank() {
		return bank;
	}
	/**
	 * set bank
	 * @param bank	define bank of this ATM
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	/**
	 * get state
	 * @return state  current state of this ATM
	 */
	public String getState() {
		return state;
	}
	/**
	 * set state
	 * @param state define this ATM's state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * get current customer
	 * @return currentCustomer return current customer of this ATM
	 */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}
	/**
	 * set currentCustomer
	 * @param currentCustomer	define current customer of this ATM
	 */
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
	/**
	 * get currentAccount
	 * @return currenAccount	return current account of this ATM
	 */
	public Account getCurrentAccount() {
		return currentAccount;
	}
	/**
	 * set current account
	 * @param currentAccount	define current account of this ATM
	 */
	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}

}

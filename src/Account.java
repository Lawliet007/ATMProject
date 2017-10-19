/**
 * 
 * @author Davka
 *
 */
public class Account {
	/**
	 * balance double type
	 */
	static double balance = 0;   
	/**
	 * accountNumber number of this account
	 */
	static int accountNumber;
	
	/**
	 * Account class's construction function
	 * @param balance1	customer's balance 
	 * @param accountNumber1	customer's account number
	 */
	Account(double balance1, int accountNumber1){
		balance = balance1;
		accountNumber = accountNumber1;
	}
	/**
	 * deposit function
	 */
	public static void deposit() {
		
	}
	/**
	 * withdraw function
	 */
	public static void withdraw() {
		
	}

	/**
	 * get balance information
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * set balance
	 * @param balance	define balance of this account
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * get account numbers
	 * @return account number
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * set account number
	 * @param accountNumber	define account number of this account
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}

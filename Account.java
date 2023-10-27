import java.util.Date;

public class Account{
	// Declare the necessary private local variables.
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	
	/* Constructors */
	Account () {
		/* Constructor for Account with no arguments */
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(System.currentTimeMillis());
	}
	Account (int newId, double newBalance) {
		/* Constructor for Account with specified id and balance data fields */
		id = newId;
		balance = newBalance;
		annualInterestRate = 0;
		dateCreated = new Date(System.currentTimeMillis());
	}
	
	/* Mutators */
	void withdraw(double amount) {
		/* Conditional mutator for the balance data field */
		if (balance >  amount) {
			balance -= amount;
		}
		else {
			System.out.println("Cannot withdraw $" + amount + " because account only contains $" + balance);
		}
	}
	void deposit(double amount) {
		/* Mutator for the balance data field */
		balance += amount;
	}
	
	/* Getters */
	double getBalance() {
		/* Getter for the balance data field */
		return balance;
	}
	double getMonthlyIntrestRate() {
		/* Getter for the monthly interest rate (calculated based off of the annualInterestRate data field) */
		return  annualInterestRate/12;
	}
	Date getDateCreated() {
		/* Getter for the dateCreated data field */
		return dateCreated;
	}
	int getAccountId() {
		/* Getter for the id data field */
		return id;
	}
	
	/* Setters */
	void setAnnualInterestRate(double newRate) {
		/* Setter for the annualInterestRate data field */
		annualInterestRate = newRate;
	}
	void setBalance(double newBalance) {
		/* Setter for the balance data field */
		balance = newBalance;
	}
	void setId(int newId) {
		/* Setter for the id data field */
		id = newId;
	}
	public static void main(String[] args) {
		// Declare the necessary variables to test the Account class.
		int testId = 1122;
		double testBalance = 20000.00;
		double testAnnualInterestRate = 4.5;
		// Create the Account object.
		Account testAccount = new Account(testId, testBalance);
		// Manipulate the Account object.
		testAccount.setAnnualInterestRate(testAnnualInterestRate);
		testAccount.withdraw(2500.00);
		testAccount.deposit(3000.00);
		// Display values from the Account object.
		System.out.println("Balance: $" + testAccount.getBalance());
		System.out.println("Monthly Interest Rate: " + testAccount.getMonthlyIntrestRate() + "%");
		System.out.println("Date of Creation: " + testAccount.getDateCreated());
	}


}

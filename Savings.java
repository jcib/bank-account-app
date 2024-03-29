package bankaccountapp;

public class Savings extends Account {
	// List properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Saving properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	// List any methods specific to saving accounts
	@Override
	public void setRate() {
		rate = getBaseRate() * .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: SAVINGS");
		super.showInfo();
		System.out.println("Your savings account features" +
							"\nSafety Deposit Box ID: " + safetyDepositBoxID +
							"\nSafety Deposit Box Key: " + safetyDepositBoxKey
		);
	}
}

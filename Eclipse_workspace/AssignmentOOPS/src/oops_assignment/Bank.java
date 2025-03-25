package oops_assignment;

class BankAccount {

	private String accountNumber;
    private String accountHolderName;
    private double balance;

    @Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", getAccountHolderName()=" + getAccountHolderName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.setAccountNumber(accountNumber);
        this.setAccountHolderName(accountHolderName);
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}

public class Bank{
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("IND001", "Guru", 50000);
		System.out.println(ba1.getAccountNumber());
		System.out.println(ba1.getAccountHolderName());
		ba1.displayBalance();
		ba1.deposit(10000);
		ba1.displayBalance();
		ba1.withdraw(5000);
		ba1.displayBalance();

	}
}
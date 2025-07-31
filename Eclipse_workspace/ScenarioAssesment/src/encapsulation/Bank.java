package encapsulation;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public void getBalance() {
    	System.out.println("The balance is : "+balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

public class Bank
{
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("BA101", "Guru", 5000);
		System.out.println("Details : ");
		
		System.out.println(ba1.getAccountHolderName());
		ba1.getBalance();
		
		ba1.deposit(5000);
		ba1.getBalance();
		
		ba1.withdraw(2000);
		ba1.getBalance();
    }
}

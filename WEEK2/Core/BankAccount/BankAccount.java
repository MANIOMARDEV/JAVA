import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private String accountNumber;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount() {
        accounts++;
        //Ninja Bonus 3: In the constructor, call the private method from above
        // so that each user has a random ten-digit account.
        this.accountNumber = getAccountNumber();
    }

    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        this.accountNumber = getAccountNumber();
    }

    // GETTERS and SETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static int getAccounts() {
        return accounts;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public double deposit(double amount, String accountType) {
        double newTotalAmount = 0.0;
        if (accountType.equals("checking")) {
            this.checkingBalance += amount;
            totalMoney += amount;
            newTotalAmount = this.checkingBalance;
        } else if (accountType.equals("saving")) {
            this.savingsBalance += amount;
            totalMoney += amount;
            newTotalAmount = this.savingsBalance;
        } else {
            System.out.println("Please specify a valid account type (checking/saving)");
        }
        return newTotalAmount;
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public double withdraw(double amount, String accountType) {
        double newTotalAmount = 0.0;
        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0.0;
        }
        if (accountType.equals("checking")) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
                newTotalAmount = this.checkingBalance;
            } else {
                System.out.println("There are insufficient funds");
            }
        } else if (accountType.equals("saving")) {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
                newTotalAmount = this.savingsBalance;
            } else {
                System.out.println("There are insufficient funds");
            }
        } else {
            System.out.println("Please specify a valid account type (checking/saving)");
        }
        return newTotalAmount;
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("Your Checking Balance is: " + this.getCheckingBalance());
        System.out.println("Your Savings Balance is: " + this.getSavingsBalance());
    }

    //Ninja Bonus 2: Create a private method that returns a random ten digit account number.
    private String getAccountNumber() {
        Random randomno = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(randomno.nextInt(10));
        }
        return accountNumber.toString();
    }
}


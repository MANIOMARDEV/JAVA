public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount bankaccount1 = new BankAccount();
        BankAccount bankaccount2 = new BankAccount();
        BankAccount bankaccount3 = new BankAccount();
        
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        double newCheckingBalance = bankaccount1.deposit(2000, "checking"); // Corrected spelling of "checking"
        double newSavingsBalance = bankaccount1.deposit(1000, "savings"); // Corrected spelling of "savings"
        System.out.println("newCheckingBalance = " + newCheckingBalance);
        System.out.println("newSavingsBalance = " + newSavingsBalance);
    
        // Second bank account
        double newCheckingBalance2 = bankaccount2.deposit(500, "checking"); // Corrected spelling of "checking"
        double newSavingsBalance2 = bankaccount2.deposit(1000, "savings"); // Corrected spelling of "savings"
        System.out.println("newCheckingBalance2 = " + newCheckingBalance2);
        System.out.println("newSavingsBalance2 = " + newSavingsBalance2);
        
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        double withdrawCheckingBalance = bankaccount1.withdraw(2000, "checking"); // Corrected spelling of "checking"
        double withdrawSavingsBalance = bankaccount1.withdraw(1000, "savings"); // Corrected spelling of "savings"
        System.out.println("withdrawCheckingBalance = " + withdrawCheckingBalance);
        System.out.println("withdrawSavingsBalance = " + withdrawSavingsBalance);
        
        // Second bank account
        double withdrawCheckingBalance2 = bankaccount2.withdraw(700, "checking"); // Corrected spelling of "checking"
        double withdrawSavingsBalance2 = bankaccount2.withdraw(1000, "savings"); // Corrected spelling of "savings"
        System.out.println("withdrawCheckingBalance2 = " + withdrawCheckingBalance2);
        System.out.println("withdrawSavingsBalance2 = " + withdrawSavingsBalance2);
        
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("the sum of all bank account is " + BankAccount.getTotalMoney());
        System.out.println("the Number accounts is " + BankAccount.getAccounts());
    }
}



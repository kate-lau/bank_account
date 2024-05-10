import java.time.LocalDate;

public class Runner {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("Kate", "Lau", LocalDate.of(2000, 7, 19), 228, 12, "Savings", -500);

// MANUAL TESTING - GETTERS
        System.out.println("Hello " + bankAccount.getFirstName() + " " + bankAccount.getLastName() + " (DOB: " + bankAccount.getDateOfBirth() + "), the current balance of your bank account (#" + bankAccount.getAccountNumber() + ") is £" + bankAccount.getBalance() +".");

// MANUAL TESTING - SETTERS
        bankAccount.setFirstName("Emilie");
        bankAccount.setLastName("Cheung");
        bankAccount.setDateOfBirth(LocalDate.of(2000, 8, 16));
        bankAccount.setAccountNumber(70);
        bankAccount.setBalance(999.00);

        System.out.println("Hello " + bankAccount.getFirstName() + " " + bankAccount.getLastName() + " (DOB: " + bankAccount.getDateOfBirth() + "), the current balance of your bank account (#" + bankAccount.getAccountNumber() + ") is £" + bankAccount.getBalance() +".");

// MANUAL TESTS - DEPOSIT/WITHDRAWAL
        bankAccount.deposit(1);
        // We use the getter again to check that the amount of storage has been updated
        System.out.println("After your deposit, your new balance is £" + bankAccount.getBalance() + ".");

        bankAccount.withdrawal(100);
        System.out.println("After your withdrawal, your new balance is £" + bankAccount.getBalance() + ".");

// INTEREST - SAVINGS/CURRENT
        bankAccount.payInterest(0.05, 0.02);
        System.out.println("After " + bankAccount.getAccountAgeInMonths() + " months of interest in your " + bankAccount.getAccountType() + " account, your new balance is £" + bankAccount.getBalance() + ".");
    }

}


public class Runner {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("Kate", "Lau", "19-07-2000", 228, 0, 12);

// MANUAL TESTING - GETTERS
        System.out.println("Hello " + bankAccount.getFirstName() + " " + bankAccount.getLastName() + " (DOB: " + bankAccount.getDateOfBirth() + "), the current balance of your bank account (No." + bankAccount.getAccountNumber() + ") is £" + bankAccount.getBalance() +".");

// MANUAL TESTING - SETTERS
        bankAccount.setFirstName("Emilie");
        bankAccount.setLastName("Cheung");
        bankAccount.setDateOfBirth("16-08-2000");
        bankAccount.setAccountNumber(70);
        bankAccount.setBalance(999);

        System.out.println("Hello " + bankAccount.getFirstName() + " " + bankAccount.getLastName() + " (DOB: " + bankAccount.getDateOfBirth() + "), the current balance of your bank account (No." + bankAccount.getAccountNumber() + ") is £" + bankAccount.getBalance() +".");

// MANUAL TESTS - DEPOSIT/WITHDRAWAL
        bankAccount.deposit(1);
        // We use the getter again to check that the amount of storage has been updated
        System.out.println("After your deposit, your new balance is £" + bankAccount.getBalance() + ".");

        bankAccount.withdrawal(100);
        System.out.println("After your withdrawal, your new balance is £" + bankAccount.getBalance() + ".");

// INTEREST
        bankAccount.payInterest(0.05);
        System.out.println("After " + bankAccount.getAccountAgeInMonths() + " months of interest, your new balance is £" + bankAccount.getBalance() + ".");
    }
}
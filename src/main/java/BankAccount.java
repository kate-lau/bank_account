import java.time.LocalDate;

public class BankAccount {
    // PROPERTIES
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance; // Should start at 0!
    private int accountAgeInMonths;
    private String accountType;
    private int overdraft;

    // CONSTRUCTORS
    public BankAccount(String firstNameData, String lastNameData, LocalDate dateOfBirthData, int accountNumberData, int accountAgeInMonthsData, String accountTypeData, int overdraftData) {
        this.firstName = firstNameData;
        this.lastName = lastNameData;
        this.dateOfBirth = dateOfBirthData;
        this.accountNumber = accountNumberData;
        this.balance = 0;
        this.accountAgeInMonths = accountAgeInMonthsData;
        this.accountType = accountTypeData;
        this.overdraft = overdraftData;
    }

    // GETTERS & SETTERS
//    FIRST NAME
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //    LAST NAME
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //    DATE OF BIRTH
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //    ACCOUNT NUMBER
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //    BALANCE
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //    ACCOUNT AGE IN MONTHS
    public int getAccountAgeInMonths() {
        return this.accountAgeInMonths;
    }

    public int setAccountAgeInMonths(int accountAgeInMonths) {
        this.accountAgeInMonths = accountAgeInMonths;
        return accountAgeInMonths;
    }

    // ACCOUNT TYPE
    public String getAccountType() {
        return this.accountType;
    }

    public String setAccountType(String accountType) {
        this.accountType = accountType;
        return accountType;
    }

    // OVERDRAFT

    // METHODS
    // DEPOSIT
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    } // think of these as setters. That's why they're void. If you want to check you should use the getter.

    // WITHDRAWAL
    public void withdrawal(double withdrawalAmount) {
        if ((this.balance - withdrawalAmount) >= overdraft) {
            this.balance -= withdrawalAmount; // Why does it do it twice?
        } else ;
    }


    // INTEREST - CURRENT/SAVINGS

    public double calculateInterest(double interestRate) {
        return this.balance * interestRate * this.accountAgeInMonths;
    }

    public void payInterest(double savingsInterestRate, double currentInterestRate) {
        if (accountType.equals("Savings")) {
            this.balance += this.calculateInterest(savingsInterestRate);
        } else if (accountType.equals("Current")) {
            this.balance += this.calculateInterest(currentInterestRate);
        }

    }
}

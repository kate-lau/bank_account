public class BankAccount {
    // PROPERTIES
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance; // Should start at 0!
    private int accountAgeInMonths;

    // CONSTRUCTORS
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, int inputBalance, int inputAccountAgeInMonths) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
        this.accountAgeInMonths = inputAccountAgeInMonths;
    }

    // GETTERS & SETTERS
//    FIRST NAME
    public String getFirstName() {
        return this.firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    //    LAST NAME
    public String getLastName() {
        return this.lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    //    DATE OF BIRTH
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //    ACCOUNT NUMBER
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    //    BALANCE
    public int getBalance() {
        return this.balance;
    }

    public int setBalance(int balance) {
        this.balance = balance;
        return balance;
    }

    //    ACCOUNT AGE
    public int getAccountAgeInMonths() {
        return this.accountAgeInMonths;
    }

    // METHODS
    // DEPOSIT
    public int deposit(int depositAmount) {
        this.balance += depositAmount;
        return this.balance;
    }

    // WITHDRAWAL
    public int withdrawal(int withdrawalAmount) {
        this.balance -= withdrawalAmount;
        return this.balance;
    }
     // INTEREST
     public int payInterest(double interestRate){
        this.balance += (this.balance * interestRate * this.accountAgeInMonths);
        return this.balance;
     }
}

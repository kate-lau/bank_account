public class BankAccount {
    // PROPERTIES
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance; // Should start at 0!
    private int accountAgeInMonths;
    private String accountType;
    private int overdraft;

    // CONSTRUCTORS
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, int inputBalance, int inputAccountAgeInMonths, String inputAccountType, int inputOverdraft) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
        this.accountAgeInMonths = inputAccountAgeInMonths;
        this.accountType = inputAccountType;
        this.overdraft = inputOverdraft;
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
    public int deposit(int depositAmount) {
        this.balance += depositAmount;
        return this.balance;
    }

    // WITHDRAWAL
    public int withdrawal(int withdrawalAmount) {
        if ((this.balance -= withdrawalAmount) >= this.overdraft) {
            this.balance -= withdrawalAmount; // Why does it do it twice?
        }
        else;
        return this.balance; // How to make it do nothing?
    }


        // INTEREST - CURRENT/SAVINGS
        public void payInterest ( double savingsInterestRate, double currentInterestRate){
            if (this.accountType.equals("Savings")) {
                this.balance += (int) (this.balance * savingsInterestRate * this.accountAgeInMonths);
            } else this.balance += (int) (this.balance * currentInterestRate * this.accountAgeInMonths);
        }

    }

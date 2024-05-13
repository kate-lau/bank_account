import org.junit.jupiter.api.BeforeEach; // Why didn't I need this?
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount; // In this test file, we need an object of the Bank Account class, and it will be called bankAccount.

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Kate", "Lau", LocalDate.of(2000, 7, 19), 228, 12, "Savings", -50);
    }

// GETTER TESTS
    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Kate");
    }
    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Lau");
    }
    @Test
    public void canGetDateOfBirth(){
        bankAccount.getDateOfBirth();
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("2000-07-19");
    }
    @Test
    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(228);
    }
    @Test
    public void canGetBalance(){
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }

// SETTER TESTS
    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Emilie");
        assertThat(bankAccount.getFirstName()).isEqualTo("Emilie");
    }
    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Cheung");
        assertThat(bankAccount.getLastName()).isEqualTo("Cheung");
    }
    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth(LocalDate.of(2000, 8, 16));
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("2000-8-16");
    }
    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(70);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(70);
    }
    @Test
    public void canSetBalance(){
        bankAccount.setBalance(999);
        assertThat(bankAccount.getBalance()).isEqualTo(999);
    }

    // DEPOSIT TEST
    @Test
    public void canMakeDeposit(){
        bankAccount.deposit(888);
        assertThat(bankAccount.getBalance()).isEqualTo(888);
    }

    // WITHDRAWAL TESTS
    @Test
    public void canWithdraw__true(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(10);
        assertThat(bankAccount.getBalance()).isEqualTo(90.00);
    }
    @Test
    public void canWithdraw__false(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(200);
        assertThat(bankAccount.getBalance()).isEqualTo(100.00);
    }

    @Test
    public void canWithdrawalInOverdraft__true(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(125);
        assertThat(bankAccount.getBalance()).isEqualTo(-25.00);
    }
    @Test
    public void canWithdrawalInOverdraft__false(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(200);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    // INTEREST TEST
    @Test
    public void canPayInterest(){
        bankAccount.deposit(900);
        bankAccount.payInterest(0.05, 0.02);
        assertThat(bankAccount.getBalance()).isEqualTo(1440.00);
    }
}

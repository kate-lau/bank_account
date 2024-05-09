import org.junit.jupiter.api.BeforeEach; // Why didn't I need this?
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Kate", "Lau", "19-07-2000", 228, 0, 12, "Savings", -500);

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
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("19-07-2000");
    }
    @Test
    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(228);
    }
    @Test
    public void canGetBalance(){
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }

// SETTER TESTS
    @Test
    public void canSetFirstName(){
        String result = bankAccount.setFirstName("Emilie");
        assertThat(result).isEqualTo("Emilie");
    }
    @Test
    public void canSetLastName(){
        String result = bankAccount.setLastName("Cheung");
        assertThat(result).isEqualTo("Cheung");
    }
    @Test
    public void canSetDateOfBirth(){
        String result = bankAccount.setFirstName("16-08-2000");
        assertThat(result).isEqualTo("16-08-2000");
    }
    @Test
    public void canSetAccountNumber(){
        int result = bankAccount.setAccountNumber(70);
        assertThat(result).isEqualTo(70);
    }
    @Test
    public void canSetBalance(){
        int result = bankAccount.setBalance(999);
        assertThat(result).isEqualTo(999);
    }

    // DEPOSIT TEST
    @Test
    public void canMakeDeposit(){
        int result = bankAccount.deposit(888);
        assertThat(result).isEqualTo(888);
    }

    // WITHDRAWAL TEST
    @Test
    public void canMakeWithdrawal(){
        int result = bankAccount.withdrawal(10);
        assertThat(result).isEqualTo(-10);
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BankAccountTest {

   BankAccount bankAccount; //lets Java know that we will be using a variable called bankAccount

   @BeforeEach
   public void setUp() {
      bankAccount = new BankAccount("John",
              "Doe",
              "20thMay1998",
              12345,
              123);
   }

   //SETTERS AND GETTERS TESTS
   @Test
   public void hasFirstName() {
      assertThat(bankAccount.getFirstName()).isEqualTo("John");
   }

   @Test
   public void canSetFirstName() {
      bankAccount.setFirstName("John");
      assertThat(bankAccount.getFirstName()).isEqualTo("John");
   }

   @Test
   public void hasLastName() {
      assertThat(bankAccount.getLastName()).isEqualTo("Doe");
   }

   @Test
   public void canSetLastName() {
      bankAccount.setLastName("Doe");
      assertThat(bankAccount.getLastName()).isEqualTo("Doe");
   }

   @Test
   public void hasDateOfBirth() {
      assertThat(bankAccount.getDateOfBirth()).isEqualTo("20thMay1998");
   }

   @Test
   public void getDateOfBirth() {
      bankAccount.setDateOfBirth("20thMay1998");
      assertThat(bankAccount.getDateOfBirth()).isEqualTo("20thMay1998");
   }

   @Test
   public void hasAccountNumber() {
      assertThat(bankAccount.getAccountNumber()).isEqualTo(12345);
   }

   @Test
   public void canSetAccountNumber() {
      bankAccount.setAccountNumber(12345);
      assertThat(bankAccount.getAccountNumber()).isEqualTo(12345);
   }

   @Test
   public void hasBalance() {
      assertThat(bankAccount.getBalance()).isEqualTo(123);
   }

   @Test
   public void canSetBalance() {
      bankAccount.setBalance(123);
      assertThat(bankAccount.getBalance()).isEqualTo(123);
   }


   // METHOD TESTS
   @Test
   public void canDepositFunds() {
      bankAccount.deposit(123);
      assertThat(bankAccount.getBalance()).isEqualTo(246);
   }

   @Test
   public void canWithdrawFunds() {
      bankAccount.withdrawal((23));
      assertThat(bankAccount.getBalance()).isEqualTo(100);
   }

   @Test
   public void canPayInterest(){
      bankAccount.payInterest(0.2);
      assertThat(bankAccount.getBalance()).isEqualTo(147);
   }
}

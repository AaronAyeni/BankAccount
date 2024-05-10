public class BankAccountTest {
   public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount();


      bankAccount.getFirstName();
      bankAccount.setFirstName("John");

      bankAccount.getLastName();
      bankAccount.setLastName("Doe");

      bankAccount.getDateOfBirth();
      bankAccount.setDateOfBirth("20thMay1998");

      bankAccount.getAccountNumber();
      bankAccount.setAccountNumber(12345);

      bankAccount.getBalance();
      bankAccount.setBalance(123);

      bankAccount.deposit(123);

      bankAccount.withdrawal((12));

      bankAccount.payInterest(100);
   }
}

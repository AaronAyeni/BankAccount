public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

    //CONSTRUCTORS a constructor is the part of your program that tells java how you want your objects made
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setDateOfBirth(String lastName){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }


    public void deposit(int amount){
    this.balance += amount;
    }
    public void withdrawal(int amount){
        this.balance -= amount;
    }
    public void payInterest(double percentage){
        double interestToPay = this.balance * percentage;
        this.balance += interestToPay;
    }
}

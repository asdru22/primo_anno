public class BankAccount {
    protected int number;
    protected String owner;
    protected double balance;
    
    public BankAccount(int accountNumber,String ownerName, double initialBalance) {
        this.number = accountNumber;
        this.owner = ownerName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {}
    public void withdraw(double amount) {}
    public int getNumber() {return this.number;}
    public String getName() {return this.owner;}
    public String getBalance() {return ""+this.balance;}
    public String toString() {return this.owner + this.number+ this.balance;}
   }
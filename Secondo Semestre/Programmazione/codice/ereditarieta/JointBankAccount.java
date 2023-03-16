public class JointBankAccount extends BankAccount {

    private String coOwner;
    
    public JointBankAccount(int accountNumber,String ownerName, double initialBalance,String coOwner) {
        super(accountNumber,ownerName,initialBalance);
        this.coOwner = coOwner;
        }
    public String toString() {return balance + owner+ number+ coOwner;}
   }
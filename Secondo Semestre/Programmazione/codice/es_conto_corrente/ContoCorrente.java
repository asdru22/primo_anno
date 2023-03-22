public class ContoCorrente {
    protected String Owner;
    protected double Balance;
    protected int ID;

    public ContoCorrente(String Owner,int ID){
        this.Owner = Owner;
        this.Balance = 0;
        this.ID = ID;
    }
    public ContoCorrente(String Owner,int ID,double Balance){
        this.Owner = Owner;
        this.Balance = Balance;
        this.ID = ID;
    }
    public void Withdraw(double value){
        if (Balance < value) {            
            throw new IllegalArgumentException(
                "value exceedes balance");
            } else {
                Balance -= value;
            }
    }
    public void Deposit(double value){
        if (value<0) {
            throw new IllegalArgumentException(
                "value is negative");
            } else {
                Balance += value;
            }
    }
    public String toString(){
        return Owner+"'s Balance is " +Balance;
    }
}

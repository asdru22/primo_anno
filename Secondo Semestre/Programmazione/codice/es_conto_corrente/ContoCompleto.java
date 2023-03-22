import java.util.ArrayList;
public class ContoCompleto extends ContoCorrenteInternazionale {
    private ArrayList<Movimenti> MovimentiConto;

    public ContoCompleto(String Owner,int ID){
        super(Owner,ID,Valuta.EUR);
        MovimentiConto = new ArrayList<Movimenti>();
    }
    public ContoCompleto(String Owner,int ID,Valuta valuta){
        super(Owner,ID,valuta);
        MovimentiConto = new ArrayList<Movimenti>();
    }
    public ContoCompleto(String Owner,int ID,double Balance,Valuta valuta){
        super(Owner,ID,Balance,valuta);
        MovimentiConto = new ArrayList<Movimenti>();
    }
    public void AggiungiMovimento(Movimenti m){
        MovimentiConto.add(m);
    }
    @Override
    public void Withdraw(double value){
        Withdraw(value,"N/A");
    }
    public void Withdraw(double value,String arg){
        if (Balance < value) {
            IllegalArgumentException exception =
            new IllegalArgumentException(
            "value exceedes balance");
            throw exception;
            } else {
                Balance -= value;
                AggiungiMovimento(new Movimenti(-value, arg));
            }
    }
    @Override
    public void Deposit(double value){
        Deposit(value,"N/A");
    }
    public void Deposit(double value,String arg){
        if (value<0) {
            IllegalArgumentException exception =
            new IllegalArgumentException(
            "value is negative");
            throw exception;
            } else {
                Balance += value;
                AggiungiMovimento(new Movimenti(value, arg));
            }
    }

    public void stampaMovimenti(int n){
        if (n>MovimentiConto.size()) {
            IllegalArgumentException exception =
            new IllegalArgumentException(
            "value is too high");
            throw exception;
            } else {
                for(int i = MovimentiConto.size()-1;i>=0;i--){
                    System.out.println(MovimentiConto.get(i).toString());
                }
            }
    }
}

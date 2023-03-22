public class Movimenti {
    private double Valore;
    private String Causale;

    public Movimenti(double Valore,String Causale){
        this.Valore = Valore;
        this.Causale = Causale;
    }

    public String toString(){
        return "modificato il conto per "+Valore+" con causale \""+Causale+"\"";
    }
}

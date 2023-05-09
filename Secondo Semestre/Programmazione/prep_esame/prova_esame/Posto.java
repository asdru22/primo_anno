public class Posto{
    private int numero;
    private Veicolo veicolo;

    public Posto(int numero, Veicolo veicolo){
        this.numero= numero;
        this.veicolo= veicolo;
    }
    public Veicolo getVeicolo(){
        return veicolo;
    }
    public int getNumero(){
        return numero;
    }
}
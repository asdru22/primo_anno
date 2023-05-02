public class Furgone extends Veicolo{
    private int carico;

    public Furgone(int immatricolazione,String marca,String alimentazione,int cilindrata,int carico){
        super(immatricolazione,marca,alimentazione,cilindrata);
        this.carico=carico;
    }
    public String toString(){
        return super.toString()+", carico: " +carico;
    }
}
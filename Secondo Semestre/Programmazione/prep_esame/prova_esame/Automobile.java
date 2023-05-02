public class Automobile extends Veicolo{
    private int porte;

    public Automobile(int immatricolazione,String marca,String alimentazione,int cilindrata,int porte){
        super(immatricolazione,marca,alimentazione,cilindrata);
        this.porte=porte;
    }
    public String toString(){
        return super.toString()+", porte: " +porte;
    }
    
}
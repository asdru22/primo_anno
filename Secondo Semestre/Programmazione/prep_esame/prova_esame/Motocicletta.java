public class Motocicletta extends Veicolo{
    private String tipo;
    private int tempi;

    public Motocicletta(int immatricolazione,String marca,String alimentazione,int cilindrata,String tipo,int tempi){
        super(immatricolazione,marca,alimentazione,cilindrata);
        this.tipo = tipo;
        this.tempi = tempi;
    }
    public String toString(){
        return super.toString()+", tipo: " +tipo+", tempi: " +tempi;
    }
    
}
/*
- anno di immatricolazione (intero)
- marca (stringa)
- tipo alimentazione (stringa)
- cilindrata (intero)
*/
public class Veicolo{
    private int immatricolazione;
    private String marca;
    private String alimentazione;
    private int cilindrata;

    public Veicolo(int immatricolazione,String marca,String alimentazione,int cilindrata){
        this.immatricolazione= immatricolazione;
        this.marca = marca;
        this.alimentazione= alimentazione;
        this.cilindrata =cilindrata;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    public String toString(){
        return "Immat:"+immatricolazione+", marca: "+marca+", alimentazione: "+alimentazione+", cilinadreata:"+cilindrata;
    }
}
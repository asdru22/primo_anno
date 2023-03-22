public class ContoCorrenteInternazionale extends ContoCorrente {

    private final Valuta ValutaConto;

    public ContoCorrenteInternazionale(String Owner,int ID){
        super(Owner,ID);
        ValutaConto = Valuta.EUR;
    }
    public ContoCorrenteInternazionale(String Owner,int ID,Valuta valuta){
        super(Owner,ID);
        ValutaConto = valuta;
    }
    public ContoCorrenteInternazionale(String Owner,int ID,double Balance,Valuta valuta){
        super(Owner,ID,Balance);
        ValutaConto = valuta;
    }
    @Override
    public String toString(){
        return Owner+"'s Balance is " +Balance+" "+ValutaConto;
    }
}

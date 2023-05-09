public class Impiegato extends Lavoratore{

    public Impiegato(String nome,int matricola, int anno_assunzione, double stipendio){
        super(nome,matricola,anno_assunzione,stipendio);
    }
    @Override
    public double getStipendio(){
        return (2023-anno_assunzione)+stipendio*100;
    }
}
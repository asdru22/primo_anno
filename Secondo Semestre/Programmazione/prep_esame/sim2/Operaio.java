public class Operaio extends Lavoratore{

    public Operaio(String nome,int matricola, int anno_assunzione, double stipendio){
        super(nome,matricola,anno_assunzione,stipendio);
    }

    @Override
    public double getStipendio(){
        return (2023-anno_assunzione)+stipendio*120;
    }
}
public class Manager extends Lavoratore{
    private int bonus;
    public Manager(String nome,int matricola, int anno_assunzione, double stipendio,int bonus){
        super(nome,matricola,anno_assunzione,stipendio);
        this.bonus = bonus;
    }

    @Override
    public double getStipendio(){
        return (2023-anno_assunzione)+stipendio+bonus;
    }
}
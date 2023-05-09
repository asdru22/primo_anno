public abstract class Lavoratore extends Persona{
    protected int matricola;
    protected int anno_assunzione;
    protected double stipendio;

    public Lavoratore(String nome,int matricola, int anno_assunzione, double stipendio){
        super(nome);
        this.matricola = matricola;
        this.anno_assunzione = anno_assunzione;
        this.stipendio = stipendio;
    }
    public void setMatricola(int n){
        matricola = n;
    }
    
    abstract public double getStipendio();
}
public class Persona {
    private String nome;
    private String cognome;
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public void Presentati(){
        System.out.println("mi chiamo "+this.nome+ " "+this.cognome);
    }

    public String GetName(){
        return this.nome;
    }
    public String GetSurame(){
        return this.cognome;
    }
}

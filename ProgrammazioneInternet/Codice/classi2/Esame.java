import java.time.*;
public class Esame {
    private String nome;
    private int voto;
    private LocalDate data;
    public Esame(String nome,int voto, LocalDate data){
        this.nome = nome;
        this.voto = voto;
        this.data = data;
    }
    public String getName(){
        return this.nome;
    }
    public boolean superato(){
    	if (this.voto >=18) return true;
    	else return false;
    }
}

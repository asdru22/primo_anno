import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class ContoCorrente {
    private int Numero; 
    private Persona Persona;
    private int Saldo;
    private Persona Persona2;
    public ContoCorrente(int Numero, Persona Persona, int Saldo){
        this.Numero = Numero;
        this.Persona = Persona;
        this.Saldo = Saldo;
        this.Persona2 = null;
    }
    public ContoCorrente(int Numero, Persona Persona, int Saldo,Persona Persona2){
        this.Numero = Numero;
        this.Persona = Persona;
        this.Saldo = Saldo;
        this.Persona2 = Persona2;
    }
    public void Informazioni(){
        System.out.println("Informzioni CC Condiviso:\nNumero: "+Numero);
        if(Persona2!=null){
        System.out.println("Persona2: "+Persona2.GetName()+" "+Persona2.GetSurame());
        }
        System.out.println("Persona1: "+Persona.GetName()+" "+Persona.GetSurame()+"\nSaldo: "+Saldo);
    }
    public void Preleva(int valore){
        if(valore<0) System.out.println("Errore prelievo");
        else if(valore>Saldo) System.out.println("Non hai quei soldi");
        else this.Saldo -= valore;
    }
    public void Deposita(int valore){
        if(valore<0) System.out.println("Errore deposito");
        else this.Saldo += valore;
    }
    public Persona getIntestatario(){
        return Persona;
    }
}

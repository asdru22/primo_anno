public class ContoCorrente {
    private int Numero; 
    private String Persona;
    private int Saldo;
    public ContoCorrente(int Numero, String Persona, int Saldo){
        this.Numero = Numero;
        this.Persona = Persona;
        this.Saldo = Saldo;
    }
    public void Informazioni(){
        System.out.println("Informzioni CC:\nNumero: "+Numero+"\nPersona: "+Persona+"\nSaldo: "+Saldo);
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
}

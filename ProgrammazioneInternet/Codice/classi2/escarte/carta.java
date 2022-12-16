public class carta {
    private int numero;
    private seme seme;
    
    public carta(int n, seme seme){
        this.numero = n;
        this.seme = seme;
    }

    public String stampacarta(){
        return this.numero+" di "+this.seme+ ", ";
    }
}

class Prodotti{
    private int codice;
    private int quantita;
    private double prezzo;
    private String descrizione;

    Prodotti(int codice, int quantita, double prezzo, String descrzione){
        this.codice = codice;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.descrizione = descrzione;
    }
    public String toString(){
        return "Codice: "+ codice+ "\nquantita: "+quantita+"\nPrezzo: "+prezzo+"\nDescrizione: "+descrizione;
    }
}
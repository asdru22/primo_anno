public class smartphone{
    private marca marca;
    private String modello;
    private int prezzo;
    public smartphone(marca marca, String modello, int prezzo){
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public marca getbrand(){
        System.out.println(this.marca.values());
    }

    public void GestoreSmartphone(smartphone[] v){
        for(int i = 0; i<v.length;i++){

        }
    }

}

/*
Scrivere il codice di una classe GestoreSmartphone che espone un metodo che prende in
input un vettore di smartphone e stampa a video il numero di smartphone per ogni marca. I
dettagli della stampa non sono rilevanti.
Suggerimento: il metodo .values() su una Enumeration restituisce un vettore con i possibili
valori.
Aggiungere alla classe GestoreSmartphone un main per testare il funzionamento dei metodi.
*/
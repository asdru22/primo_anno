public class Parete implements Colorabile{
    protected Colore colore;

    public Parete(){
        colore = Colore.giallo;
    }

    public void setColore(Colore c){
        colore = c;
    }
    public Colore getColore(){
        return colore;
    }
}
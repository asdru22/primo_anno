public class Foglio implements Colorabile{
    protected Colore colore;

    public Foglio(){
        colore = Colore.giallo;
    }

    public void setColore(Colore c){
        colore = c;
    }
    public Colore getColore(){
        return colore;
    }
}
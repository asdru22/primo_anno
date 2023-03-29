public abstract class Animale implements Riconoscibile {
    protected int Zampe;
    protected String Verso;
    protected String Nome;
    protected int AnnoNascita;

    public Animale(int Zampe, String Verso,String Nome,int AnnoNascita){
        this.Zampe = Zampe;
        this.Verso = Verso; 
        this.Nome = Nome;
        this.AnnoNascita = AnnoNascita;
    }

    public int getZampe(){return Zampe;};
    public String getVerso(){return Verso;};

    public boolean piuGrandeDi(Animale cfr){
        return AnnoNascita>=cfr.AnnoNascita;
    }

    public String toString(){
        return Nome + " ha "+ Zampe+ " zampe, fa "+ Verso +" ed è nato nel " + AnnoNascita; 
    }

    public String getName(){
        return Nome;
    }
    public int getAge(){
        return AnnoNascita;
    }

    public int ageCheck(Riconoscibile r){
        return (int)Math.abs((double) AnnoNascita-r.getAge());
    }

    public boolean nameLength(Riconoscibile r){
        return Nome.length()>r.getName().length();
    }
}

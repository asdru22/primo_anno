public abstract class motore implements rumoroso{
    protected int cilindrata;
    protected int numero_cilindri;
    protected int maxDecibel;

    public motore(int cilindrata,int numero_cilindri,int maxDecibel){
        this.cilindrata = cilindrata;
        this.numero_cilindri = numero_cilindri;
        this.maxDecibel = maxDecibel;
    }
    public abstract double getPotenza();
    public int getMaxDecibel(){
        return maxDecibel;
    }

}

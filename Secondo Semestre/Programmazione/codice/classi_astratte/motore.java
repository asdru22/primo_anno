public abstract class motore {
    protected int cilindrata;
    protected int numero_cilindri;

    public motore(int cilindrata,int numero_cilindri){
        this.cilindrata = cilindrata;
        this.numero_cilindri = numero_cilindri;
    }
    public abstract double getPotenza();
}

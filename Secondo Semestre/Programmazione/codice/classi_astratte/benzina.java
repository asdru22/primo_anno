public class benzina extends motore {

    public benzina(int cilindrata,int numero_cilindri){
        super(cilindrata, numero_cilindri);
    };
    @Override
    public double getPotenza(){
        return cilindrata/numero_cilindri/10.0;
    }
}

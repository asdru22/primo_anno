public class benzina extends motore {

    public benzina(int cilindrata,int numero_cilindri,int maxDecibel){
        super(cilindrata, numero_cilindri,maxDecibel);
    };
    @Override
    public double getPotenza(){
        return cilindrata/numero_cilindri/10.0;
    }
}

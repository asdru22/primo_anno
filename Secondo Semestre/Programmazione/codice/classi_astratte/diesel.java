public class diesel extends motore {

    public diesel(int cilindrata,int numero_cilindri,int maxDecibel){
        super(cilindrata, numero_cilindri,maxDecibel);
    };
    @Override
    public double getPotenza(){
        return cilindrata/numero_cilindri/20.0;
    }
}

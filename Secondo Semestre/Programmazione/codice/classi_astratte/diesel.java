public class diesel extends motore {

    public diesel(int cilindrata,int numero_cilindri){
        super(cilindrata, numero_cilindri);
    };
    @Override
    public double getPotenza(){
        return cilindrata/numero_cilindri/20.0;
    }
}

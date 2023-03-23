public class metano extends motore {

    public metano(int cilindrata,int numero_cilindri){
        super(cilindrata, numero_cilindri);
    };
    @Override
    public double getPotenza(){
        return (cilindrata*0.8)/numero_cilindri/4;
    }
}

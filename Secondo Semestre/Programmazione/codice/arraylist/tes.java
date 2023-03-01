import java.util.ArrayList; // simile java.util.Vector 
import java.util.Arrays;
class tes{
    public static void main(String[] args){
        ArrayList<Double> numeri = new ArrayList<Double>(Arrays.asList(1.35,0.35,0.21)); // metoodo della classe arrays che converte in lista, <Double> wrapper per double
        numeri.add(4.5);
        numeri.add(2.0);
        System.out.println(numeri);
    }
}
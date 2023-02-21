import java.util.Scanner;

public class overloading {
    static Scanner in2 = new Scanner(System.in);

    public static void main(String[] args){
        //me(1);
        //me(1.0);
        //me(1,235.0);

        //int out = getInt();
        //System.out.println("ouT: "+out);
        //System.out.println(getInt2());
        System.out.println(calcfatt(getInt2()));

    }

    public static int calcfatt(int n){
        int fatt = 0; // calcolo fattoriale
        return fatt;
    }

    public static int getInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci int");
        return in.nextInt();
    }

    public static int getInt2(){
        System.out.println("inserisci int");
        return in2.nextInt();
    }
    static void me(int a){
        System.out.println("int");
    }
    static void me(double a){
        System.out.println("double");
    }
    static void me(int a,double b){
        System.out.println("int e double");
    }
}

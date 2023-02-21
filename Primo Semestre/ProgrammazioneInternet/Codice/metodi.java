import java.util.Scanner;
public class metodi {
    public static void main(String[] args){
        /*System.out.println(func("palle")+"ooo");
        Scanner in = new Scanner(System.in);
        int[] a;
        a = new int[6];
        for(int i = 0;i<a.length;i++) a[i] = in.nextInt();
        for(int i = 0; i<a.length;i++) System.out.print(a[i]+",");
    }

    static String func(String s){
        return (s+=" scrot");
    }*/

    System.out.println("doppio:"+doppio(24));

    System.out.println("media:"+media(1,6));

    int[][] mat;
    mat = new int[4][5];

    PrintMat(mat);
    double r = 1241.25;
    Conv2Mile(r);
    Conv2Km(r);
    int x = 1;
    System.out.println(x+" primo? "+primo(x));
    
    boolean inintervallo = false;
    Scanner in = new Scanner(System.in);
    int n;
    while(!inintervallo){
        System.out.println("Inserics inumero");
        n = in.nextInt();
        inintervallo = intervallo(235, 1004,n);
    }



    }
static double Conv2Mile(double r){
    return r*0.621;
}
static double Conv2Km(double r){
    return r/0.621;
}
    
static int doppio(int i){
    return 2*i;
    }
static int somma(int a,int b){
    return a + b;
    }
static double media(int a, int b){
    return (double)somma(a,b)/2;
    }
static void PrintMat(int[][] a){
    for(int i = 0;i<a.length;i++){
        for(int j = 0;j<a[0].length;j++) System.out.print(a[i][j]);
        System.out.println();
    }
}
static boolean primo(int n){
    boolean prime = true;
    if(n <= 1) {
        prime = false;
        return prime;
    }
    else{
        for (int i = 2; i<= n/2; i++) {
            if ((n % i) == 0){
                prime = false;
                break;
            }
        }
    }
    return prime;
}
static boolean intervallo(int a,int b,int n){
    if(n>a&&n<b){
        System.out.println("trovato");
        return true;
    }
    else return false;
    }
}
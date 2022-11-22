import java.lang.String;
class ricorsione{
    public static void main(String[] args){
        //System.out.println("fattoriale: "+fattoriale(23));
        //System.out.println("fibonacci: "+fibonacci(6));
        System.out.println("base 10 a base 2: "+dec2Bin(120325)); //max 524287
        //System.out.println("somma precedenti: "+ sommapr(5));


    }
    static long fattoriale(long n){
        if(n == 0) return 1;
        else return n * fattoriale(n - 1);
    }

    static long fibonacci(long n)  {
        if(n == 0 || n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static long dec2Bin(int n) {
        return n>0 ? n % 2 == 0 ? dec2Bin(n / 2)*10 : dec2Bin(n / 2)*10 + 1 : 0;
    }

    static long sommapr(int n){
        if(n==1) return 1;
        else return n+sommapr(n-1);
    }
}
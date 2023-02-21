import java.lang.String;
public class ricorsione2 {
    public static void main(String[] args){

        //String b = "balller";
        //System.out.println(palindromo (b));
        //System.out.println(es1(54));
        //System.out.println(es2(54));
        //int[] a = {4,2,6,62,3,61};
        //System.out.println(es3(a,a.length));
        //System.out.println(es4(5));
        //System.out.println(es5(12));
        //System.out.println(es6(65)); //fattoriale di m <n
        int[] a = {2,2,2};
        System.out.println(es7(a,a.length-1));
    }

    static int es7(int[] a,int l){
    return l==0 ? a[l]*a[l] : l>=1 ? a[l]*a[l] + es7(a,l-2) : 0;
    }

    static int es6(int n){
        return es6(n,1);
    }
    static int fattoriale(int n){
        if(n == 0) return 1;
        else return n * fattoriale(n - 1);
    }
    static int es6(int n,int m){ //incremento b di 1 ogni volta
        return (fattoriale(m))>n ? m-1 : es6(n,m+1);
    }

    static int es5(int n){
        return es5(n,1);
    }
    static int es5(int n,int c){
        return (c*c<n) ? c*c+ es5(n,c+1) : 0;
    }

    static int es4(int n){
        return (n==1) ? 1: n*n+es4(n-1);
    }

    static int es3(int[] vec,int n){
        if (n == 1) return vec[0];
        return Math.min(vec[n-1], es3(vec, n-1));
    }

    static int es2(int n){
        if(n==0||n==1) return n;
        else if(n>1) return 2*es2(n-2)+1; 
        else return 0;
    }

    static int es1(int n){
        if(n<=1) return 0;
        else if(n>1&&n%2==1) return es1(n-1)+2;
        else if(n>1&&n%2==0) return es1(n/2)-1;
        else return 0;
    }

    static boolean palindromo(String str){
        return (palindromo(str,0,str.length()-1));
    }
    static boolean palindromo(String s,int start,int end){
        if (start >= end) return true;
        return (s.charAt(start)== s.charAt(end)) ? palindromo(s,start + 1, end-1) : false;
    }
}

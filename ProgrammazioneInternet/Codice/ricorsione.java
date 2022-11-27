import java.lang.String;
class ricorsione{
    public static void main(String[] args){
        //System.out.println("fattoriale: "+fattoriale(23));
        //System.out.println("fibonacci: "+fibonacci(6));
        //System.out.println("base 10 a base 2: "+dec2Bin(120325)); //max 524287
        //System.out.println("somma precedenti: "+ sommapr(5));
        //int[] vec =createarray(5);
        //printarray(vec);
        //System.out.println(sommarray(vec));
        System.out.println("Zeri: "+zeri(2100020205,2));

    }

    static int zeri(int n,int c){
        return (n>0) ? ((n%10==c) ? 1+zeri(n/10,c) : zeri(n/10,c)) : 0;
        /*if(n>0){
        if(n%10==0) return 1+zeri(n/10);
        else return zeri(n/10);
        }
        else return 0;*/
    } 
    static int sommarray(int[]v){
        return sommarray(v,0);
    }
    static int sommarray(int[] vec,int i){
        return (i==vec.length-1) ? vec[i] : vec[i] + sommarray(vec, i+1);
        //if(i==vec.length-1) return vec[i]; 
        //else return vec[i]+sommarray(vec, i+1);
    }

	static void printarray(int[] mat){
		System.out.println("-------------------------------");
		for(int i = 0;i<mat.length;i++) System.out.print(mat[i]+"\t");
			System.out.println();
		}  

    static int randomint(){
		return((int)(Math.random()*10+1));
	}
	
	static int[] createarray(int l){
	int[] mat = new int [l];
	for(int i = 0;i<mat.length;i++) mat[i] = randomint();
	return mat;
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
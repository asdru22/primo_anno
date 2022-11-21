import java.util.Scanner;
class es5{
	public static void main(String[] args){
		int a = getint();
		int A[][]= creatematrix(a,a);
		A= piramide(A);
		printmatrix(A);

		
	}
	
	static int getint(){
		System.out.println("inserisci int: ");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	static  int[][] piramide(int[][] a){
		for(int k = 1; k<a.length+1;k++){
			for(int i = k;i<a.length-k;i++)
				for(int j = k;j<a.length-k;j++) a[i][j] = k;
		}
		return a;
	}
	
	static int[][] creatematrix(int m, int n){
	int[][] mat = new int [m][n];
	for(int i = 0;i<mat.length;i++)
	for(int j = 0;j<mat[0].length;j++){
		mat[i][j] = 0;
		}
	return mat;
	}                                           
	
	static void printmatrix(int[][] mat){
		System.out.println("-------------------------------");
		for(int i = 0;i<mat.length;i++){
			for(int j = 0;j<mat[0].length;j++) System.out.print(mat[i][j]+" ");
			System.out.println();
			}
		}                
}
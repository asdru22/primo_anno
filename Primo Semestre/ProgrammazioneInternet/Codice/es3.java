import java.util.Scanner;
class es3{
	public static void main(String[] args){
		int a = getint();
		int A[][]= creatematrix(a,a);
		printmatrix(A);
		A= sommadelcazzo(A);
		printmatrix(A);

		
	}
	
	static int getint(){
	Scanner in = new Scanner(System.in);
	return in.nextInt();
	}
	
	static  int[][] sommadelcazzo(int[][] a){
		for(int i = 1;i<a.length;i++)
			for(int j = 0;j<a.length;j++) a[i][j] = (j!=0) ? a[i-1][j] + a[i-1][j-1] : a[0][0] ;
		return a;
	}
	
	static int randomint(){
		return((int)(Math.random()*10+1));
	}
	
	static int[][] creatematrix(int m, int n){
	int[][] mat = new int [m][n];
	for(int i = 0;i<mat.length;i++)
	for(int j = 0;j<mat[0].length;j++){
		mat[i][j] = 0;
		mat[0][0] = 1;
		}
	return mat;
	}                                           
	
	static void printmatrix(int[][] mat){
		System.out.println("-------------------------------");
		for(int i = 0;i<mat.length;i++){
			for(int j = 0;j<mat[0].length;j++) System.out.print(mat[i][j]+"\t");
			System.out.println();
			}
		}                
}
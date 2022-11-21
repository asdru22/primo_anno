import java.util.Scanner;
class es6{
	public static void main(String[] args){
		int a = getint();
		int b = getint();
		int A[][]= creatematrix(a,b);
		printmatrix(A);
		System.out.println(media(A));
	}
	
	static int getint(){
		System.out.print("inserisci int: ");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	static  double media(int[][] a){
		double tot=0,iter=0;
		for(int i = 0;i<a.length;i++)
		for(int j = 0;j<a[i].length;j++) {
			iter++;
			tot+=a[i][j];
		}
		return tot/iter;
	}
	
	static int randomint(){
		return((int)(Math.random()*10+1));
	}
	
	static int[][] creatematrix(int m, int n){
	int[][] mat = new int [m][n];
	for(int i = 0;i<mat.length;i++)
	for(int j = 0;j<mat[0].length;j++){
		mat[i][j] = randomint();
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
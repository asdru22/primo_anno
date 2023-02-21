class esmetodi{
	public static void main(String[] args){
		int a = 4, b = 5;
		int A[][]= creatematrix(a,b);
		printmatrix(A);
		int B[][]= creatematrix(a,b);
		sommarighe(A,B);
		printmatrix(B);

	}
	
	static int[][] sommarighe(int[][]a,int[][]b){
	for(int i = 1 ; i<a.length;i++){
		for(int j = 0;j<a[0].length;j++){
			b[i][j] = a[i][j] + a[i-1][j];
			}
		}
		return b;
	}
	
	static int randomint(){
		return((int)(Math.random()*10+1));
	}
	
	static int[][] creatematrix(int m, int n){
	int[][] mat = new int [m][n];
	for(int i = 0;i<mat.length;i++)
		for(int j = 0;j<mat[0].length;j++) mat[i][j] = randomint();
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
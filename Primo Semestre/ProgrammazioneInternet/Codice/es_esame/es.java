class es{
    public static void main(String[] args){
        //es1();
        es2();
    }
    // Definire un metodo ricorsivo che prende in input un vettore di numeri interi e restituisce
    //true se sono tutti uguali o false in caso contrario.

    static void es2(){
        int v[] = {1,1,1,1,0,1,1,1,1};
        System.out.println(check(v,1));
    }

    static boolean check(int[] v,int i){  
        if(i==v.length) return true;
        return (v[i]==v[0])? check(v,i+1) : false;
    }

    static void es1(){
        int A[][] = matrix(6,6);
        fill(A);
        printmatrix(A);

    }

    static int[][] fill(int[][] mat){
        for(int i = 1;i<mat.length;i++)
            for(int j = 0;j<mat.length;j++){
                mat[i][j] = sum(mat,i,j);
            }
            System.out.println();
        return mat;
    }
    // i = righe, j = colonne
    static int sum(int[][] A, int r, int c){
        System.out.print(r+","+c+" ");
        int tot = 0;
        tot += A[r-1][c];
        if(c-1>=0) tot += A[r-1][c-1];
        if(c+1<A.length) tot += A[r-1][c+1];
        return tot;
    }

    static int[][] matrix(int m,int n){
        int[][] mat = new int [m][n];
	    for(int i = 0;i<mat.length;i++)
                mat[0][i] = random();
	    return mat;
    }

    static int random(){
        return (int)(Math.random()*10)%10;
    }

	static void printmatrix(int[][] mat){
		System.out.println("-------------------------------");
		for(int i = 0;i<mat.length;i++){
			for(int j = 0;j<mat[0].length;j++) System.out.print(mat[i][j]+"\t");
			System.out.println();
			}
		}
}
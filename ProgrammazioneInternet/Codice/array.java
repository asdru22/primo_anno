import java.util.*;
class array {public static void main(String[] args) {
final byte es =     9;
Scanner scan = new Scanner (System.in);

if(es == 1){
    int length=10;
    double media=0;
    /*double[] atest; // dichiarazione
    atest = new double[length]; // allocazione memoria
    atest[0]= 21.2; // assegnamento
    atest[1]= 25.3;
    atest[2]= 31.6;
    atest[3]= 45.5;
    atest[4]= 35.2;
    atest[5]= 64.52;
    atest[6]= 51.62;
    atest[7]= 56.23;
    atest[8]= 58.3;
    atest[9]= 43.7;*/
    int[] atest = {5,2,6,1,4,32,6,63,1,6,4,3,6,3};
    length = atest.length;
    for(int i = 0;i<length;i++){
        media+=atest[i];
    }
    System.out.println(media/length);
}

if(es==2){
    int[] arr;
    arr = new int[10];
    for(int i = 0; i<arr.length;i++){
        arr[i] = 2- i%2;
    }
    for(int i = 0;i<arr.length;i++) System.out.println(arr[i]); // Stampa array
}

if(es==3){
    final int length = 5;
    int[] arr,aux;
    arr = new int[length];
    aux = new int[length];
    for(int i = 0; i<length;i++) arr[i] = scan.nextInt(); // input
    for(int i = 0;i <length;i++){
        int sum = 0;
        for(int j = 0;j<i+1;j++) sum+=arr[j];
        aux[i] = sum;
    }
    for(int i = 0;i<arr.length;i++) System.out.println("Total:"+aux[i]); // Stampa array

}

if(es == 4){
    final int length = 9;
    int[] arr;
    arr = new int[length];
    for(int i = 0;i<length;i++) arr[i] = scan.nextInt();
    for(int i = 0;i<length;i++) System.out.print(arr[i]+" ");
    System.out.println();
    for(int i = 0; i<length;i++){
        if(i<length-1) arr[i]=arr[i+1];
        else arr[i]=0;
    }
    for(int i = 0;i<length;i++) System.out.print(arr[i]+" ");
}

if(es==5){
    int[] arr;
    arr = new int[scan.nextInt()];
    for(int i =0;i<arr.length;i++) arr[i] = (i==0||i==1) ? arr[i]=1 : arr[i-1]+arr[i-2]; // parte importante
    for(int i = 0;i<arr.length;i++) System.err.println(arr[i]);
}

if(es==6){ // algoritmo di ordinamento
	int temp;
	int[] a = {1,2,5,6,3,6,2,6,31,62,5,6,57,2};
	for (int i = 0; i < a.length - 1; i++)
		for (int j = i; j < a.length; j++)
			if (a[i] < a[j]) { // < per ordine decrescente, > per ordine crescente
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}	
	for(int i = 0 ;i<a.length;i++) System.out.println(a[i]);
}

if(es==7){// fusione array
		int[] a = {1,2,5,6};
		int[] b = {2,6,11};
		int[] out;
		int temp;
		int length = a.length+b.length;
		out = new int[length];
		for(int i = 0; i<length;i++){
			if(i<a.length) out[i] = a[i];
			else out[i] = b[i-a.length]; 
		}
	for (int i = 0; i < out.length - 1; i++)
		for (int j = i; j < out.length; j++)
			if (out[i] < out[j]) { // < per ordine decrescente, > per ordine crescente
				temp = out[i];
				out[i] = out[j];
				out[j] = temp;
			}	
	for(int i = 0 ;i<out.length;i++) System.out.println(out[i]);
}

if(es==8){
	int c = 2, r = 23;
	int[][] mat = new int [c][r];
	int[][] tr = new int [r][c];
	for(int i = 0;i<mat.length;i++){
		for(int j =0;j<mat[0].length;j++){
			tr[j][i] = mat[i][j];
		} 
	}
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			System.out.print(tr[i][j] + "    ");
      }
      System.out.println();
    }
}

if(es==9){// funzione swap
int[] a = {1,3,5,3,6,7,2};
for(int i = 0; i <a.length;i++) System.out.print(a[i]+",");
int aux;
for(int i = 0; i<a.length/2;i++){
    aux = a[a.length-i-1];
    a[a.length-i-1] = a[i];
    a[i] = aux;
    }
System.out.println();
for(int i = 0; i <a.length;i++) System.out.print(a[i]+",");
}


}}
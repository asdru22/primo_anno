import java.util.Scanner;
import java.util.Arrays;
class es7{
	public static void main(String[] args){
		int[] v1= createarray(getint());
		printarray(v1);
        int[] v2= createarray(getint());
		printarray(v2);
		printarray(mergeIntArrays(v1,v2));	
	}
	
	static int getint(){
    System.out.print("insert int: ");
	Scanner in = new Scanner(System.in);
	return in.nextInt();
	}
	
    public static int removeduplicate(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

    public static int[] mergeIntArrays(int[] array1, int[] array2) {
        // Create an array with size 0
        // Create a pointer index int to keep track of current space in array
        int[] standinArray = new int[0];
        int standinPtr = 0;
        // iterate through array entries to grab all numbers and exclude non-existent ones
        for (int i = 0; i < array1.length; i++) {
            if(arrayContains(standinArray, array1[i])) {
                // expand array, arrays are static in nature so this is the only way without a list
                standinArray = Arrays.copyOf(standinArray, standinArray.length + 1);
                // write value to array at point of the pointer
                standinArray[standinPtr] = array1[i];
                // increment pointer
                standinPtr++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if(arrayContains(standinArray, array2[i])) {
                standinArray = Arrays.copyOf(standinArray, standinArray.length + 1);
                standinArray[standinPtr] = array2[i];
                standinPtr++;
            }
        }

        return standinArray;
    }


public static boolean arrayContains(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return true;
        }
        return false;
    
	}
	
	static int randomint(){
		return((int)(Math.random()*10+1));
	}
	
	static int[] createarray(int l){
	int[] mat = new int [l];
	for(int i = 0;i<mat.length;i++) mat[i] = randomint();
	return mat;
	}                                           
	
	static void printarray(int[] mat){
		System.out.println("-------------------------------");
		for(int i = 0;i<mat.length;i++) System.out.print(mat[i]+"\t");
			System.out.println();
		}                
}
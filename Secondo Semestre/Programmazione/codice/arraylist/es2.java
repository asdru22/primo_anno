import java.util.ArrayList;
import java.util.Scanner;
class es2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        int n =0;
        do{
            n = in.nextInt();
            if(0<=n&&n<=100) a.add(n);
            else break;
        }while(true);
        int min;
        for(int i = 0;i<a.size();i++){
            min = 9999;
            for(int j = i;j<a.size();j++){
                if(a.get(j)<min) min = a.get(j);
            }
            b.add(min);
        }
        System.out.println(b);
    }    
}

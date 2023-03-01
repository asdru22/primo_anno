import java.util.ArrayList;
import java.util.Scanner;
class es1 {
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

        for(int i = 0;i<a.size();i++)
            if(!b.contains(a.get(i))) b.add(a.get(i));
        System.err.println(b);
    }    
}

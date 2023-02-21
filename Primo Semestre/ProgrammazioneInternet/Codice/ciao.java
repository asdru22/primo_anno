import java.util.Scanner;
class ciao{
    public static void main(String[] args){
        es1();
    }

    static void es1(){
        int iter = -1;
        double tot = 0;
        double temp;
        Scanner in = new Scanner(System.in);

        do {
            temp = in.nextDouble();
            tot+= temp;
            iter += 1;
        } while(temp!=0);
        System.out.println(tot/iter);
    }

}
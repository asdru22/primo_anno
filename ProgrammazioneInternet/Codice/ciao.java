import java.lang.Math;
class ciao {
    public static void main(String[] args) {
        int i = 110,o=0,c=0;
        System.out.println(fun(i,o,c));

    }
    public static int fun(int i,int o,int c){
        if(i>0){
            o+=i%10*Math.pow(2,c);
            System.out.println(i+" "+o+" "+c);
            return fun(i/10,o,c+1);
        }
        else return o;
    }
}
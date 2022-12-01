public class eqroot {
    private double a,b,c;
    public eqroot(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double sqrt(double n){
        return Math.sqrt(n);
    }
    private double calcRoots(char op){
        return (op=='+') ? 1/(2*a)*(-b+sqrt(Math.pow(b,2)-4*a*c)) : 1/(2*a)*(-b-sqrt(Math.pow(b,2)-4*a*c)) ;
    }
    public double getRoot(char op){
        return calcRoots(op);
    }
}

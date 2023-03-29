class run {
 public static void main(String[] args){
        motore[] m = {new diesel(2,5,23),new benzina(5,3,6),new metano(34,6,54)};
        System.out.println("Media: "+media(m));
    }
static double media(motore m[]){
    double sum = 0;
    for(int i = 0; i<m.length;i++){
        sum+=m[i].getPotenza();
    }
    return (double) sum/m.length;
}
}

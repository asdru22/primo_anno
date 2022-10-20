import java.util.*;
class cicli {public static void main(String[] args) {
final byte es =           4        ;
Scanner scan = new Scanner (System.in);

if(es==    1     ){
    int n =8;
    for(int i = 1*n; i<=10*n;i+=n){
        System.out.println(i);    
    }
}

if(es==    2     ){
    int n =10;
    for(int i=n-1;i>1;i--){
       n*=i;
    }
    System.out.println(n);
}

if(es==    3     ){
    for(int j = 1;j<=10;j++){
        for(int i = 1*j; i<=10*j;i+=j){
            System.out.print(i+" ");    
        }
        System.out.println();
    }
}

if(es==    4     ){
    for(int i = 1;i<=10;i++){
        for(int j = 1;j<=10;j++){
            System.out.print(j*i+" ");
        }
        System.out.println();
    }
}

}}
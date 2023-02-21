import java.util.*;
class cicli {public static void main(String[] args) {
final byte es =           8;
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
            System.out.print(j*i+"\t ");
        }
        System.out.println();
    }
}

if(es==    5     ){
    for(byte i = 0;i<64;i--){
        System.out.println(i);
    }
}

if(es==    6     ){
    for(int i =1;i<=10;i++){
        if(i==5) continue;
        System.out.println(i);
    }
    System.out.println("fuori");
}

if(es==    7     ){
    Scanner in = new Scanner(System.in);
    int i,total=0,counter=0;
    do{
        i = in.nextInt();
        total+=i;
        counter++;
    }    while(i!=0);
    counter-=1;
    System.out.println("Totale: "+total+" Numeri inseriti: "+counter+"\nMedia:"+total/(double)counter);



}

if(es==    8     ){
    int x=432,y=633;
    while(x!=y){
        if(x>y) x-=y;
        else y-=x;
        }
    System.out.println(x);

}

if(es==    9     ){}

if(es==    10     ){}

if(es==    11     ){}

if(es==    12     ){}

if(es==    13     ){}

}}
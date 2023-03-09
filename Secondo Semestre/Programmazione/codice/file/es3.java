import java.io.*;
import java.util.Scanner;

class es3 {
public static void main(String[] args) throws FileNotFoundException{
    File f = null;
    Scanner in = new Scanner(System.in);
    do{
        System.out.println("inserisci file: ");
        f= new File(in.next());
    } while(!f.exists()||!f.canRead());
    System.out.println("file accettato\n----");
        Scanner scan = new Scanner(f);
        while (scan.hasNextLine()) {
            // leggo la riga
            String temp = scan.nextLine().toLowerCase();
            boolean stampa = false;
            for(int i = 0;i<temp.length()-1;i++){
                if(temp.charAt(i)=='t' && temp.charAt(i+1)=='t'){
                    stampa = true;
                    break;
                    }
                }
            if(stampa) System.out.println(temp);
            }
        scan.close();
    }
}
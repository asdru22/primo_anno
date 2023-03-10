import java.io.*;
import java.util.Scanner;

class es3 {
public static void main(String[] args) throws FileNotFoundException{
    File f = null;
    Scanner in = new Scanner(System.in); // scanner per input testo
    boolean errore = false;
    do{
        if(errore) System.out.println("file non accettato, inserisci nuovo file: ");
        if(!errore) System.out.println("inserisci file: ");
        f= new File(in.next());
        errore = true;
    } while(!f.exists()||!f.canRead());
    in.close();
    System.out.println("file accettato\n----");
    Scanner scan = new Scanner(f); // scanner per lettura file
    while (scan.hasNextLine()) { 
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
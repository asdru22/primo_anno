// entrambi
import java.io.FileNotFoundException;
// leggere
import java.util.Scanner;
import java.io.File;
// scrivere
import java.io.PrintWriter;

public class io {
    public static void main(String[] args) {
    scrivi("file.txt","palle\npisello");
    leggi("file.txt");
    }
    static void leggi(String filename){
        try{
            Scanner in = new Scanner(new File(filename));
            while(in.hasNextLine()) System.out.println(in.nextLine());
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error");
        }
    }
    static void scrivi(String filename,String text){
        try{
            PrintWriter out = new PrintWriter(filename);
            out.println(text);
            out.close(); 
        }
        catch(FileNotFoundException e){
            System.out.println("error");
        }
    }
}

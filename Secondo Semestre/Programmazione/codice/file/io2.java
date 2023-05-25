import java.io.*;
import java.util.Scanner;
public class io2 {
    public static void main(String[] args){
        scrivi("file.txt","palle\naboli");
        leggi("file.txt");
    }
    static void leggi(String filename){
        try{
            Scanner l = new Scanner(new File(filename));
            while(l.hasNextLine()) System.out.println(l.nextLine());
            l.close();
        }
        catch(FileNotFoundException e){}
    }
    static void scrivi(String filename,String text){
        try{
            PrintWriter p = new PrintWriter(filename);
            p.println(text);
            p.close();
        }
        catch(FileNotFoundException e){}
    }
}

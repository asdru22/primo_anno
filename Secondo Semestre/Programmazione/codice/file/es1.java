import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class es1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scf = new Scanner(new File("in.txt"));
        while (scf.hasNextLine()) {
            String riga = scf.nextLine(); // leggo la riga
            System.out.println(riga);
            }
        scf.close();
    } 
} 
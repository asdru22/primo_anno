import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class es2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scf = new Scanner(new File("in.txt"));
        while (scf.hasNextInt()) {
            // leggo la riga
            System.out.println(scf.nextInt());
            }
        scf.close();
    } 
} 
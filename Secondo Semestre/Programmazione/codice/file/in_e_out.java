import java.io.*;
import java.util.Scanner;
class in_e_out {
public static void main(String[] args) throws FileNotFoundException{
Scanner in = new Scanner(new File("in.txt"));
PrintWriter out = new PrintWriter("out.txt");
// Leggo da un file, scrivo in un altro
int i = 1;
while (in.hasNextLine()){
    out.println(i+" "+ in.nextLine()+"\t"+i);
    i++;
}
// Chiudo gli stream
in.close();
out.close();
}
}
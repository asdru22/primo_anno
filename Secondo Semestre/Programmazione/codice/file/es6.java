import java.io.*;
import java.util.Scanner;
class es6 {
public static void main(String[] args) throws FileNotFoundException{
Scanner in = new Scanner(new File("in.txt"));
PrintWriter out = new PrintWriter("out.txt");
// Leggo da un file, scrivo in un altro
int i = 1;
while (in.hasNextLine()){
    out.println(i+" "+ in.nextLine());
    i++;
}
// Chiudo gli stream
in.close();
out.close();
}
}
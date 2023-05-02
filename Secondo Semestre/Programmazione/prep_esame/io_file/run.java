import java.io.*;
import java.util.Scanner;
class run{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		while (in.hasNextLine()) out.println(in.nextLine());
		in.close();
		out.close();
	}
}
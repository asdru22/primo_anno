import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
class es5 {
public static void main(String[] args) throws FileNotFoundException{
    File f = new File("data.csv");
    Scanner scan = new Scanner(f);
    ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();
    while(scan.hasNext()){
        prodotti.add(parseLine(scan.nextLine()));
        }
    scan.close();
    System.out.println(prodotti.toString());
    Prodotti[] array = prodotti.toArray(new Prodotti[0]);
    for(int i = 0 ; i<array.length;i++){
        System.out.println(array[i].toString());
        }
    }
    
static Prodotti parseLine(String line) {
    String[] tokens = line.split(",");


    int codice = Integer.parseInt(tokens[0]);
    int quantita = Integer.parseInt(tokens[1]);
    double prezzo = Double.parseDouble(tokens[2]);
    String descrizione = tokens[3];
    System.out.println("Codice: "+ codice+ "\nquantita: "+quantita+"\nPrezzo: "+prezzo+"\nDescrizione: "+descrizione);
    return new Prodotti(codice, quantita, prezzo, descrizione);
   }
}
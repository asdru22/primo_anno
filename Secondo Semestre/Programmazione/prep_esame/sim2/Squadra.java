import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Iterator;
public class Squadra{
    private ArrayList<Lavoratore> membri;

    public Squadra(){
        this.membri = new ArrayList<Lavoratore>();
    }
    public void popolaDaFile(String filename){
        try{
            Scanner scf = new Scanner(new File(filename));
            String[] temp = new String[5];
	        while (scf.hasNextLine()){
		        temp = scf.nextLine().split(" ");
		        System.out.println("palle"+temp[0]);
		        }
            scf.close();
        }
        catch(IOException e){
            System.out.println("palle");
        }
    }

    public void salvaSuFile(String filename){
        try{
            PrintWriter out = new PrintWriter(new FileWriter(filename));
            Iterator<Lavoratore> iter = membri.iterator();
            while(iter.hasNext()){
                out.println(iter.next()+"scroto");
            }
            out.close();
        }
        catch(FileNotFoundException e){
            System.out.println("porca troia");
        }
        catch(IOException e){
            System.out.println("porca troia2");
        }
    }
    
    public void aggiungiLavoratore(Lavoratore p){
        p.setMatricola(membri.size()+1);
        membri.add(p);
    }

    public double calcolaStipendi(){
        double r = 0;
        Iterator<Lavoratore> iter = membri.iterator();
        while(iter.hasNext()){
            r+= iter.next().getStipendio();
        }
        return r;
    }
}
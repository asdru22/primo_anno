import java.util.LinkedList;
import java.util.Iterator;
import java.io.*;

public class Garage implements IGarage{
    private LinkedList<Posto> posti;

    public Garage(){
        this.posti = new LinkedList<Posto>();
    }
    
    public int add(Veicolo v){
        posti.add(new Posto(posti.size()+1,v));
        return posti.size();
    }
    public Veicolo estrai(){
        return posti.remove().getVeicolo();
    }
    public void stampa(){
        Iterator<Posto> iter = posti.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getVeicolo().toString());
        }
    }
    public int conta(int cilindrata){
        int o = 0;
        Iterator<Posto> iter = posti.iterator();
        while(iter.hasNext()){
            if(iter.next().getVeicolo().getCilindrata()>cilindrata) o++;
        }
        return o;
    }
    public void export(int n){
        try{
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
            Iterator<Posto> iter = posti.iterator();
            while(iter.hasNext()&&n>0){
                out.println(iter.next().getVeicolo().toString());
                n--;
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
}
import java.util.*;

public class es5 {
    public static void main(String[] args) {
        List<Contenitore> l = new LinkedList<>();
        l.add(new Contenitore(5));
        l.add(new Contenitore(5));        
        l.add(new Contenitore(2));
        l.add(new Contenitore(1));
        l.add(new Contenitore(2));

        System.out.println(no_ripetuti(l));
    }
    public static Set<Integer> no_ripetuti(List<Contenitore> l){
        Set<Integer> r = new HashSet<>();
        ArrayList<Integer> found = new ArrayList<>();
        for(Contenitore c : l ){
            if(found.contains(c.getCapienza())) r.add(c.getCapienza()); 
            else found.add(c.getCapienza());
        }
        return r;
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class run{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l);
        //duplicaDispari(l);
        //stampaInverso(l);
        inverti(l);
        System.out.println(l);
    }
    public static void stampaInverso(List<Integer> l){
        ListIterator<Integer> iter = l.listIterator(l.size());
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
    }
    public static void inverti(List<Integer> l){
        int s = l.size();
        for(int i = 0 ; i<s ; i++ ){
            int x = l.remove(0);
            l.add(x);
        }
    }
    public static void duplicaDispari(List<Integer> l){
        ListIterator<Integer> iter = l.listIterator();
        int pari= 0 ;
        while(iter.hasNext()){
            int x = iter.next();
            if(x%2==0){
                iter.remove();
                pari+=1;
            }
            else for(int i = 0 ;i<pari;i++) iter.add(x);
        }
    }
}
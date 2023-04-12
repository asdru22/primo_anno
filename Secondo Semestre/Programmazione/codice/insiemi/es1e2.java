import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class es1e2{
    public static void main(String[] args) {
        /*Set<book> set = new HashSet<>();
        set.add(new book("a",1835));
        set.add(new book("b",1992));
        set.add(new book("c",2034));
        set.add(new book("d",2004));

        set = date(set,2000);
        System.out.println(set);*/

        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("ba");
        set.add("ca");
        set.add("da");
        set.add("ea");

        remove(set);
        System.out.println(set);

    }
    public static Set<String> remove(Set<String> s){
        Set<String> c  = new HashSet<>();
        c.addAll(s);
        for(String p : c){
            if(p.charAt(0)=='a'||p.charAt(0)=='e'||p.charAt(0)=='o'||p.charAt(0)=='i'||p.charAt(0)=='u')s.remove(p);
        }
        return s;
    }
    public static Set<book> date(Set<book> s,int date){
        Set<book> r = new HashSet<>();
        for(book b : s) if(b.getYear()>date) r.add(b);
        return r;
    }
}
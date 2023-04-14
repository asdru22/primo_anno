import java.util.*;

public class es4 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        a.add("aaa");
        a.add("ccc");
        a.add("bbb");
        Set<String> b = new HashSet<>();
        b.add("fff");
        b.add("eee");
        b.add("bbb");
        System.out.println(merge(a,b));
    }

    public static Set<Character> merge(Set<String> a, Set<String> b){
        Set<Character> i = new TreeSet<Character>();
        for(String x : a) i.add(x.toUpperCase().charAt(0));
        for(String x : b) i.add(x.toUpperCase().charAt(0));
        return i;
    }
}

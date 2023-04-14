import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

class run{
    public static void main(String[] args) {
        String[] s = {"bbb","aaaa","oooo","ggg","fffff"};
        to_dict(s);
    }
    public static void to_dict(String[] a){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(String s : a){
            if(!contains(s.length(),h.keySet())) h.put(s.length(),1);
            else{
                h.replace(s.length(),h.get(s.length())+1);
            }
        }
        System.out.println(h);
    }
    public static boolean contains(int n,Set<Integer> s){
        return s.contains(n);
    } 
}
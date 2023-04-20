import java.util.*;
public class es {
    public static void main(String[] args) {
    String s = "ciao a tutti raga";
    System.out.println(parse(s));
    }
    public static HashMap<Character,ArrayList<Integer>> parse(String s){
        HashMap<Character,ArrayList<Integer>> h = new HashMap<Character,ArrayList<Integer>>();
        for(int i = 0; i <s.length();i++){
            if(s.charAt(i)!=' '){
                dict(s.charAt(i),h,i);
            }
        }
        return h;
    }
    public static void dict(char c,HashMap<Character,ArrayList<Integer>> h,int pos){
        if(!h.containsKey(c)){
            ArrayList<Integer> clist = new ArrayList<Integer>();
            clist.add(pos); 
            h.put(c,clist);
        }
        else h.get(c).add(pos);
    }
}

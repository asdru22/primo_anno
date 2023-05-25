import java.util.HashMap;
class es{
    public static void main(String[] args){
        HashMap<Integer,String> s = new HashMap<>();
        s.put(24,"palle");
        s.put(14,"pisenselo");
        s.put(14,"svsa");

        System.out.println(s.get(24));
        System.out.println(s.toString());
        System.out.println(s.size());
    }
}
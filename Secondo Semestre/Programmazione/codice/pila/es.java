import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
public class es {
    public static void main(String[] args) {
        Deque<Integer> s = new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        //evenrrmove(s);
        altremove(s);
        System.out.println(s);

    }
    public static void altremove(Deque<Integer> s){
        int length = s.size();
        int temp;
        for(int i = 0 ;i<length;i++){
            temp = s.pop();
            if(temp%2==1) s.addLast(temp);
        }
    }
    public static void evenrrmove(Deque<Integer> s){
        Iterator<Integer> iter = s.iterator();
        while(iter.hasNext()){
            if(iter.next()%2==0) iter.remove();
        }
    }
}

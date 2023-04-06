import java.util.ArrayDeque;
import java.util.LinkedList;

public class deq {

	public static void main(String[] args) {

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		queue.add(1); // come addLast() - FIFO
		queue.add(4);	  
		queue.add(6);
		queue.add(3);
		queue.remove();

				
		System.out.println(queue);
		
		LinkedList<Integer> listqueue = new LinkedList<Integer>();
		
		listqueue.addFirst(1); // LIFO
		listqueue.addFirst(4);	
		listqueue.addLast(6);
		listqueue.addFirst(3);
			
		System.out.println(listqueue);

		listqueue.remove();
		listqueue.removeLast();
		
		System.out.println(listqueue);

	}

}
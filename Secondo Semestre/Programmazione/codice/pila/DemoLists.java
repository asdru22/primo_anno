import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import java.util.Iterator;

public class DemoLists {

	public static void main(String[] args) {
		
		/*List<Integer> li1 = new ArrayList<Integer>();
		
		li1.add(1);
		li1.add(4);	
		li1.add(6);
		li1.add(3);

		System.out.println(li1.get(2));		
		System.out.println(li1);
		
		List<String> ls2 = new LinkedList<String>();
		
		ls2.addAll(Arrays.asList("ciao","hello", "hallo", "hola"));
		
		System.out.println(ls2);

		int somma = 0;
		Iterator<Integer> iter = li1.iterator();
		
		while(iter.hasNext()){
			somma+=iter.next();
		}
		System.out.println("Somma: "+somma);*/

		List<String> ls2 = new LinkedList<String>();
		
		ls2.addAll(Arrays.asList("ciao","hello", "hallo", "hola"));
		System.out.println(paroleAdiacentiC(ls2));
	}
	public static int paroleAdiacentiC(List<String> ls2){
		int adiacenti = 0;
		Iterator<String> iterS = ls2.iterator();
		while(iterS.hasNext()){
			if(iterS.next().charAt(0)=='c' && iterS.hasNext()){
				iterS.hasNext().next().charAt(0)=='c'
			}
		}
		return adiacenti;
	}
	public static int paroleC(List<String> ls2){
		int pc = 0;
		Iterator<String> iter2 = ls2.iterator();
		while(iter2.hasNext()){
			if(iter2.next().charAt(0)=='c') pc+=1;
		}
		return pc;
	}
} 
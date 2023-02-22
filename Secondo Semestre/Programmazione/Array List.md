Metodi della classe
```java
import java.util.ArrayList;
public class arrlist {
	public static void main(String[] args) {
		ArrayList<String> colori = new ArrayList<String>();
		colori.add("giallo");
		colori.add("rosso");
		colori.add("verde");
		System.out.println("Lista: "+colori);
		System.out.println("Primo elemento: "+colori.get(0));
		colori.set(0,"arancione");
		System.out.println("Primo elemento cambiato: "+colori.get(0));
		colori.remove(0);
		System.out.println("Primo elemento: "+colori.get(0));
		System.out.println("Numero elementi: "+colori.size());
		
	}
}
```

Iterare sugli elementi
```java
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```
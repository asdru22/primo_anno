## Liste
```java
class Nodo{
Object info;
Nodo next;
}
```
## ArrayList
```java
// metodi
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

```java
// iterazione
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

## Eccezzioni
Quando viene eseguita l’istruzione `throw` il metodo si arresta immediatamente
Per segnalare al compilatore che il nostro metodo non gestisce eccezioni `checked` si usa la keyword `throws`
```java
public class Coin {
	public void read(BufferedReader in) throws IOException {
	// Se IOException, rilanciata
	double value = Double.parseDouble(in.readLine());
	name = in.readLine();
	}
	... 
}
```
Try-Catch
```java
try {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(“How old are you?”);
	String inputLine = in.readLine();
	int age = Integer.parseInt(inputLine);
	age++;
	System.out.println(“Next year you’ll be “ + age);
} 
catch (IOException exception) {
	System.out.println(“I/O exception “ + exception); 
} 
catch (NumberFormatException exception) {
System.out.println(“Input was not a number”);
}
```
Caso generico
```java
public class BankAccount {
	public void withdraw(double amount) {
		if (balance < amount) { // Parametro amount troppo grande
			throw new IllegalArgumentException( “Amount exceedes balance”);
		} else ...
```
## Files
leggere da file
```java
import java.io.*;
import java.util.Scanner;
public class letturaFileThrows {
	public static void main(String[] args) throws FileNotFoundException {
	// Non gestisce l’eccezione ma la rilancia… A chi?
	Scanner scf = new Scanner(new File("info.txt"));
	while (scf.hasNextLine()){
		String riga = scf.nextLine();
		System.out.println("RIGA: "+riga);
		}
	scf.close();
	}
}
```
completo
```java
import java.io.*;
import java.util.Scanner;
public class letturaFile {
    public static void main(String[] args) {
        try { // In questo caso l’eccezione viene gestita
            Scanner scf = new Scanner(new File("info.txt"));
            while (scf.hasNextLine()) {
                String riga = scf.nextLine();
                System.out.println("RIGA: " + riga);
            }
            scf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Attenzione! Il file non esiste");
        }
    }
}
```
Controllo esistenza e leggibilità file
```java
// Non solleva eccezioni anche se myFile non è ok!
File f = new File(“myFile.dat”);
if (!f.exists()) {
    System.out.println(“File non esistente!”);
    return 1;
}
if (!f.canRead()) {
    System.out.println(“File non leggibile!”);
    return 2;
}
Scanner scan = new Scanner(f);
```
Scrivere su file
```java
import java.io.*;
import java.util.Scanner;
...
Scanner in = new Scanner(new File(“input.dat”));
PrintWriter out = new PrintWriter(“output.dat”);
// Leggo da un file, scrivo in un altro
while (in.hasNextLine()) out.println(in.nextLine());
// Chiudo gli stream
in.close();
out.close();
// A questo punto, ho copiato input.dat in
// output.dat
```
## Ereditarietà
```java
public class SubclassName extends SuperclassName {
dichiarazione nuovi attributi,
se esistono dichiarazione costruttori (mai ereditati)
dichiarazione nuovi metodi,se esistono
dichiarazione metodi overridden (sovrascritti), se esiston
}
```
- Un attributo public è accessibile da ogni classe
- Un attributo private è accessibile solo dalla classe che lo contiene (no sottoclasse)
- Un attributo protected è accessibile solo da classi dello stesso package e da ogni sottoclasse
La sottoclasse che ridefinisce un metodo `m` può comunque invocare la versione della superclasse con `super.m(…parametri…)`, o solamente `super(...)`  per il costruttore
## Polimorfismo
```java
// Questo è OK:
Donna IS-A Persona Persona alice = new Donna(“Alice Rossi”);
// Questo NO: Non sempre Persona IS-A Donna
Donna alice = new Persona(“Alice Rossi”);
```
Object amnesia
```java
Object p = new Point(3,4);
Object c = new Circle(p,5);
//Illegale        Legale 
p.getX()        ((Point) p).getX()
c.getCenter()   ((Circle) c).getCenter()
```
Si può inibire la ridefinizione di un metodo con `final public final void f(){…}`
Esempio ereditarietà con override di metodi
```java
public class Rectangle extends Shape {
    double s1;
    double s2;
    public Rectangle(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override
    public double getArea() {
        return s1 * s2;
    }
    @Override
    public double getPerimeter() {
        return (s1 + s2) * 2;
    }
}
```
## Interfacce
- Un’interfaccia non include costruttori, specifica funzionalità ma non come creare oggetti che la implementano
- Una classe che implementa un’interfaccia deve implementarne tutti i metodi, ma può anche aggiungerne altri
- Un’interfaccia può essere implementata da più classi
- Una classe implementata da un interfaccia usa `implements`, non `extends`
## Generics
La definizione di una classe generica si esprime con la sintassi: `ClassName<T>`
La keyword `extends` permette di imporre che la classe che sostituisce il tipo generico deve implementare l’interfaccia `Comparable` 
> Attenzione: si usa `extends` e non `implements`
```java

```

```java

```

```java

```

```java

```

```java

```
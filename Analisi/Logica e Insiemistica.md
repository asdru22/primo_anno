### Insiemistica
$A$ si dice sottoinsieme proprio di $B$ se $\forall a\in A\implies a\in B\ \wedge\ A\ne B$
$A=B\ \Leftrightarrow\ A\subseteq B\wedge B\subseteq A$.  $A$ è sottoinsieme improprio di $A$.
$A\subset B\wedge B\supset A\to$ sottoinsieme proprio
$A\subseteq B\wedge B\supseteq A\to$ sottoinsieme improprio

### Insiemi
L'insieme dei numeri pari è definito da $\{x|\ x=2n,n\in\mathbb R\}$
$x-1=0\wedge (x-1)^2=0$ hanno lo stesso insieme soluzione (ma molteplicità diversa).
L'insieme delle parti è l'insieme dato da tutti i sottoinsiemi degli elementi che costituiscono un insieme. Un insieme di $n$ elementi un insieme delle parti costituito da $2^n$  insiemi (elementi).

### Prodotto Cartesiano tra due Insiemi
$A\times B=\{(a,b)|\ a\in A,b\in B\}$
$A\times B\ne B\times A$

### Operazioni logiche
- Una contraddizione è un'affermazione logica assurda, falsa.
- Una tautologia è un affermazione sempre vera.
$p\wedge\bar p$ contraddizione, $p\vee\bar p$ tautologia (principio del terzo escluso)
**Teorema di DeMorgan**:  $\bar A\cup\bar B= \overline{A\cap B}$

### Implicazioni
$p\implies q$. Se $p$  è vero, allora $q$ è vero. $p$ è condizione sufficente per $q$
**Contronominale**: $p\implies q\to\ \bar q\implies\bar p$.
$p\implies q\equiv\bar p\vee q=\overline{p\wedge\bar q}$. Se $p\wedge\bar q$ è falsa, $p\implies q$ è vera.
$p\Leftrightarrow q\equiv p\implies q\wedge q\implies p$

### Relazioni
Relazione da $A$ a $B\ \subset\ A\times B$.
$aRb\ (a;b)\in\mathbb R$ ($b=f(a)$)
Due relazioni sono uguali quando hanno stesso insieme di partenza.
Una funzione relazionale biunivoca ha l'insieme di partenza uguale al dominio.
$f:A\to B$ è una funzione da $A$ a $B$ se 
1. $\forall a\in A\exists\ b\in B|\ (a;b)\in f$, con $f$ definita ovunque in $A$, dove $A$ è il dominio di $f$.
2. $(x;y_1)\wedge(x;y_2)\in f\implies y_1=y_2$ biunivocità.
$(x;y)\in f$ è l'insieme delle coppie sul piano cartesiano.

### Tipi di funzioni
Una funzione $f:A\to B$ è suriettiva se $\forall b\in B\ \exists a\in A|\ (a;b)\in f$
Una funzione $f:A\to B$ è iniettiva se $(x_1;y)\wedge(x_2;y)\in f\implies x_1=x_2$
La funzione composta di $f:A\to B$ e $g:B\to C$ è $f\circ g:A\to C=f(g(x))=g(f(x))$
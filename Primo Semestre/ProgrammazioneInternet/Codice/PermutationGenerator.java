import java.util.ArrayList;
/*
Questa classe genera le permutazioni di una parola.
*/
public class PermutationGenerator {
    public static void main(String[] args){
    }

    /*
    Costruisce un generatore di permutazioni.
    @param aWord la parola da permutare
    */
    public PermutationGenerator(String aWord) {
        word = aWord;
    }
    /*
    Fornisce tutte le permutazioni della parola.
    turn un vettore contenente tutte le permutazioni
    */
    public ArrayList < String > getPermutations() {
        ArrayList < String > result = new ArrayList < String > ();
        // La stringa vuota ha un’unica permutazione:se stessa
        if (word.length() == 0) {
            result.add(word);
            return result;
        }
        // effettua un ciclo su tutti i caratteri della stringa
        for (int i = 0; i < word.length(); i++) {
            // Componi una parola più breve eliminando il car. i-esimo
            String shorterWord = word.substring(0, i) +
                word.substring(i + 1);
            // Genera tutte le permutazioni della parola più breve
            PermutationGenerator shorterPermutationGenerator
                = new PermutationGenerator(shorterWord);
            ArrayList < String > shorterWordPermutations = shorterPermutationGenerator.getPermutations();
            // Aggiungi il carattere escluso all’inizio di ciascuna
            // permutazione della parola più breve
            for (String s: shorterWordPermutations) {
                result.add(word.charAt(i) + s);
            }
        }
        // Restituisce tutte le permutazioni
        return result;
    }
    private String word;
}
import java.lang.String;
public class ricorsione2 {
    public static void main(String[] args){

        String b = "radar";
        System.out.println(palindromo (b));
    }

    static boolean palindromo(String str){
        return (palindromo(str,0,str.length()-1));
    }
    static boolean palindromo(String s,int start,int end){
        if (start >= end) return true;
        return (s.charAt(start)== s.charAt(end)) ? palindromo(s,start + 1, end-1) : false;
    }
}

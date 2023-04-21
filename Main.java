import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
    public static int makeAnagram(String a, String b) {
        int deletes = 0;
        HashMap<Character,Integer> caracteres = new HashMap<Character,Integer>();
        if(a.length()<b.length()){
            String aux = b;
            b=a; a=aux;
        }
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        for (char c : charsA) {
            if(caracteres.containsKey(c)){
                caracteres.put(c, caracteres.get(c)+1);
            }
            else{
                caracteres.put(c, 1);
            }
        }
        for (char c : charsB) {
            if(caracteres.containsKey(c)){
                caracteres.put(c, caracteres.get(c)-1);
            }
            else{
                deletes++;
            }
        }
        for (char c: caracteres.keySet()) {
            deletes+= caracteres.get(c);
        }

        return deletes;
        }
}

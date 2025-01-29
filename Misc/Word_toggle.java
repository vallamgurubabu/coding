package Misc;
import java.util.*;

class Word_toggle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] words = sentence.split(" ");
        s.close();
        
        for (int i = 0; i < words.length; i++) {
            if (Character.isLowerCase(words[i].charAt(0))) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].toUpperCase();
            }
        }
        
        String result = String.join(" ", words);
        System.out.println(result);
    }
}

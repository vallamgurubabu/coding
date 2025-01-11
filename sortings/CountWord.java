package sortings;

import java.util.ArrayList;

public class CountWord {
    public static void main(String[] args) {
        String word = "Hello                 World";
        ArrayList<String> arr = new ArrayList<>();
        String w ="";
        for (int i = 0; i <= word.length(); i++) {
            if (i == word.length() || word.charAt(i) == ' ') {
                if (w.length() != 0) {
                    arr.add(w);
                    w = "";
                }
            } else {
                w += word.charAt(i);
            }
        }

        System.out.println(arr.size());


    }
}

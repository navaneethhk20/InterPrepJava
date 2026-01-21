package Year2025.Sep.Ex21092025.p3;

import java.util.HashSet;

public class l8 {
    public static void main(String[] args) {
        String input="navaneeth";

            HashSet<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (set.add(c)) {
                    sb.append(c);
                }
            }
        System.out.println( sb.toString());
    }
}

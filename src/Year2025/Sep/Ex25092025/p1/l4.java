package Year2025.Sep.Ex25092025.p1;

import java.util.HashSet;

public class l4 {
    public static void main(String[] args) {
        String input="navaneeth";
        HashSet<Character> set= new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(char ch: input.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

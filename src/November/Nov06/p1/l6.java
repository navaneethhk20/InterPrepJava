package November.Nov06.p1;

import java.util.HashMap;


public class l6 {
    public static void main(String[] args) {
                String input = "navaneeth";
                long total = countUniquePermutations(input);
                System.out.println("Total unique combinations: " + total);
            }

           public static long countUniquePermutations(String str) {
                HashMap<Character, Integer> hashmap = new HashMap<>();
                for (char c : str.toCharArray()) {
                    hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
                }


                long numerator = factorial(str.length());


                long denominator = 1;
                for (int count : hashmap.values()) {
                    denominator = denominator*factorial(count);
                }

                return numerator / denominator;
            }

            public static long factorial(int n) {
                long fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact = fact*i;
                }
                return fact;

    }
}

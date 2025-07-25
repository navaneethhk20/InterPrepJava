package Ex252627072025.Part1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Lab07 {
    public static void main(String[] args) {
        //print middle non repeating character
        String input = "Switchas switches que testing";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (char ch : input.toCharArray()) {

                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);

        }

        ArrayList<Character> hashset = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if(ch !=' '){
            if (hashmap.get(ch) == 1 && !hashset.contains(ch)) {
                System.out.print(ch + " ");
                hashset.add(ch);

            }

            }
        }

        hashset.toString();
        System.out.println();

        int middlecharcount = hashset.size()/2;
        char middlechar = hashset.get(middlecharcount);
        System.out.println(middlechar);
    }
}

package Year2025.August.July.Ex05072025.Strings;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class String_printUniqueCharacter {
    public static void main(String[] args) {
        //print the unique characters in a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print out the unique characters");
        String str =sc.next();

        HashMap<Character,Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }

        HashSet<Character> printed = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) > 1 && !printed.contains(ch)) {
                System.out.print(ch + " ");
                printed.add(ch);
            }
        }
        System.out.println("  ");

        HashSet<Character> uniquePrinted = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1 && !uniquePrinted.contains(ch)) {
                System.out.print(ch + " ");
                uniquePrinted.add(ch);
            }
        }
    }
}

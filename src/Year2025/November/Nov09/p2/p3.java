package Year2025.November.Nov09.p2;

import java.util.HashMap;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        String input="Today is Monday";

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);

        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char cha:input.toCharArray()){
            hashmap.put(cha, hashmap.getOrDefault(cha,0)+1);
        }


        int count= hashmap.getOrDefault(ch,0);
        System.out.println("count of " +ch+" is "+count);




    }
}

package December.Dec04.p4;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name= sc.nextLine().toLowerCase();
        int vowel=0;
        int consonant=0;
        for(char ch:name.toCharArray()){
            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

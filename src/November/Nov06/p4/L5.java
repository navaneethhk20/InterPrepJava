package November.Nov06.p4;

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.nextLine().toLowerCase();
        int vowel=0;
        int consonat=0;
        for(char ch:input.toCharArray()){
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else {
                consonat++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonat);
    }
}

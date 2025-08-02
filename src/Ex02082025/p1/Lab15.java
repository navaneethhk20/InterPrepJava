package Ex02082025.p1;

import java.util.ArrayList;

import java.util.Collections;

public class Lab15 {
    public static void main(String[] args) {
        //reverse string
        String input= "I Am Not String";
        //output="g ni rtS toNmAT"
        char[] words = input.toCharArray();
        ArrayList<Character>list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }
        Collections.reverse(list);
        int index=0;
        for(int i=0;i<=input.length()-1;i++){
            if(words[i]!=' '){
                words[i]=list.get(index++);
            }
        }
        System.out.println(words);
    }
}

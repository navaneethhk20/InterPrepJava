package Ex11082025.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P14 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char [] cha= input.toCharArray();
        int index=0;

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }

        Collections.reverse(list);

        for(int i=0;i<=input.length()-1;i++){
            if(cha[i]!=' '){
                cha[i]=list.get(index++);
            }

        }
        System.out.println(cha);

    }
}

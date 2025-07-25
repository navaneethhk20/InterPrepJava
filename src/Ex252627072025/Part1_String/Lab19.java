package Ex252627072025.Part1_String;

import java.util.ArrayList;
import java.util.Collections;

public class Lab19 {
    public static void main(String[] args) {
        String ip= "I Am Not String";
        //output= "g ni rtS NotmAI";
        //output: "gnirtS toN mA I";
        char [] ch = ip.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for(char cha: ip.toCharArray()){
            if(cha!=' ') {
                list.add(cha);
            }

        }
        Collections.reverse(list);
        int index=0;

        for(int i=0;i<=ip.length()-1;i++) {
            if (ch[i] != ' '){
                ch[i] = list.get(index++);
            }
        }
        System.out.println(ch);

    }
}

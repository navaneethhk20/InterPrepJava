package Year2025.Sep.Ex09092025;

import java.util.ArrayList;
import java.util.Collections;

public class i10 {
    public static void main(String[] args) {
        String input = "I Am Not String";
        char[] ch= input.toCharArray();
        ArrayList<Character>list = new ArrayList<>();
        int index=0;
        for(char cha: input.toCharArray()) {
            if (cha != ' ') {
                list.add(cha);
            }
        }
        Collections.reverse(list);
        for(int i=0;i<=input.length()-1;i++){
            if(ch[i]!=' '){
                ch[i]=list.get(index++);
            }
        }
        System.out.println(ch);
    }
}

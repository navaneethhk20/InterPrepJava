package Ex20250927.p2;

import java.util.ArrayList;
import java.util.Collections;

public class l7 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char [] ch= input.toCharArray();
        int index=0;
        ArrayList<Character> list =new ArrayList<>();

        for(char cha:input.toCharArray()){
            if(cha!=' '){
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

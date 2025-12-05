package August.Ex20250809.p1;

import java.util.ArrayList;
import java.util.Collections;

public class L12 {
    public static void main(String[] args) {
        String input="H Kn ithu";
        char[] ch= input.toCharArray();
        ArrayList<Character>list = new ArrayList<>();
        for(char cha:input.toCharArray()) {
            if (cha != ' ') {
                list.add(cha);
            }
        }

        Collections.reverse(list);
        int index=0;

        for(int i=0;i<=input.length()-1;i++){
            if(ch[i] !=' '){
                ch[i]=list.get(index++);
            }
        }
        System.out.println(ch);
    }
}

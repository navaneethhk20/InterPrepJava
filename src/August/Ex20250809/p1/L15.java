package August.Ex20250809.p1;

import java.util.ArrayList;
import java.util.Collections;

public class L15 {
    public static void main(String[] args) {
        String input= "I Am Not A String";
        char []cha= input.toCharArray();
        ArrayList<Character>list= new ArrayList<>();
        for (char ch: input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }

        Collections.reverse(list);
        int index=0;
        for(int i=0;i<=input.length()-1;i++){
            if(cha[i]!=' '){
                cha[i]=list.get(index++);
            }
        }
        System.out.println(cha);
    }
}

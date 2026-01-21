package Year2025.August.Ex12082025;

import java.util.ArrayList;
import java.util.Collections;
public class p18 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char [] chars = input.toCharArray();
        ArrayList<Character> list= new ArrayList<>();

        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }

        Collections.reverse(list);
        int index=0;

        for(int i=0;i<=input.length()-1;i++){
            if(chars[i]!=' '){
                chars[i]=list.get(index++);
            }
        }
        System.out.println(chars);
    }
}

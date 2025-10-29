package October.oct29.p2;

import java.util.ArrayList;
import java.util.Collections;

public class l6 {
    public static void main(String[] args) {
        String input="I Am Not String";
        int index=0;
        char [] ch= input.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for(char cha: input.toCharArray()){
            if(cha!=' '){
                list.add(cha);
            }
        }


        for(int i=input.length()-1;i>=0;i--){
            if(ch[i]!=' '){
                ch[i]=list.get(index++);
            }
        }
        System.out.println(ch);
    }
}

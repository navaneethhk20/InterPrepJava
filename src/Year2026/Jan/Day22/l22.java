package Year2026.Jan.Day22;

import java.util.ArrayList;
import java.util.HashSet;

public class l22 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char[] ch= input.toCharArray();
        int index=0;
        ArrayList<Character> list =new ArrayList<>();
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

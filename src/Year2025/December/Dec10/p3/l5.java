package Year2025.December.Dec10.p3;

import java.util.ArrayList;

public class l5 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char[] ch= input.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for(char cha: input.toCharArray()) {
            if (cha != ' ') {
                list.add(cha);
            }
        }

        int index=0;

        for(int i=input.length()-1;i>=0;i--){
            if(ch[i]!=' '){
                ch[i]=list.get(index++);
            }
        }
        System.out.println(ch);

    }
}

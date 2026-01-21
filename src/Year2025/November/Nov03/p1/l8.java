package Year2025.November.Nov03.p1;

import java.util.ArrayList;

public class l8 {
    public static void main(String[] args) {
        String input="I Am Not String";
        char[] cha = input.toCharArray();
        int index=0;
        ArrayList<Character>list = new ArrayList<>();
        for(char ch:input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }

        for(int i=input.length()-1;i>=0;i--){
            if(cha[i]!=' '){
                cha[i]=list.get(index++);
            }
        }
        System.out.println(cha);
    }
}

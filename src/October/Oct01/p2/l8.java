package October.Oct01.p2;

import java.util.ArrayList;

public class l8 {
    public static void main(String[] args) {
        String input="I Am Not Stirng";
        char[] ch=input.toCharArray();
        int index=0;
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

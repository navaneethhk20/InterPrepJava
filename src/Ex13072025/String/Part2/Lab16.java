package Ex13072025.String.Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab16 {

    public static void reverseOfName(String input){
        char[] result = input.toCharArray();

        List <Character> list = new ArrayList<>();
        for (char ch: input.toCharArray()) {
            if (ch != ' ') {
                list.add(ch);
            }
        }

        Collections.reverse(list);

        int index =0;
        for(int i=0;i<=input.length()-1;i++){
            if(result[i]!=' '){
                result[i] = list.get(index++);
            }
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        String input =" I am Dog Person";
        System.out.println(input);
        reverseOfName(input);
    }
}

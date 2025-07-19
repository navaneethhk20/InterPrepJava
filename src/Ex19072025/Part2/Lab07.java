package Ex19072025.Part2;

import java.util.ArrayList;
import java.util.Collections;

public class Lab07 {
    public static void main(String[] args) {
        String input ="I Am Not String";
        //output = "g ni rtS toNmAI"
        char[] result = input.toCharArray();

        ArrayList<Character> chars = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' '){
                chars.add(ch);
            }
        }
        Collections.reverse(chars);
        int index=0;
        for(int i=0;i<=input.length()-1;i++){
            if (result[i] != ' ') {
                result[i] =chars.get(index++);
            }
        }
        System.out.println(result);
    }
}

package August.Ex16082025.p1;

import java.util.HashMap;

public class p6 {
    public static void main(String[] args) {
        String input="hosurukumarnithu";
        int repeatingcount=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {

                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

        }
        for(int i=0;i<input.length()-1;i++){

            char currentchar = input.charAt(i);
            int freqeucy= hashMap.get(currentchar);

                if(freqeucy>1){
                    repeatingcount++;



            }

        }
        System.out.println(repeatingcount);
    }
}

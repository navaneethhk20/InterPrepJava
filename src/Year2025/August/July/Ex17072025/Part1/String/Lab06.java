package Year2025.August.July.Ex17072025.Part1.String;

import java.util.HashMap;

public class Lab06 {
    public static void main(String[] args) {
        //count the characters that occurs repeatedly
        String name ="Hosurukoppalu nithu magge";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch: name.toCharArray()) {
            if (ch != ' ') {

                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        int count=0;
        for(int frequency: hashMap.values()){
            if(frequency>1){
                count++;
            }
        }
        System.out.println(count);
    }
}

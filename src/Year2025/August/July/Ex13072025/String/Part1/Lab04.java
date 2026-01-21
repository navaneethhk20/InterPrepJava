package Year2025.August.July.Ex13072025.String.Part1;

import java.util.HashMap;

public class Lab04 {
    public static void main(String[] args) {
        //Input= "Ramesh Sachin Tendulkar" count the char print the repeated
        String input ="Ramesh Sachin Tendulkar";
        input = input.toLowerCase();
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray() ){
            if(ch != ' ') {
                hashMap.put(ch , hashMap.getOrDefault(ch,0) +1);
            }
        }


        int repeating =0;
        for(int frequency : hashMap.values()){
            if(frequency>1){
                repeating++;
            }
        }
        System.out.println(repeating);
    }
}

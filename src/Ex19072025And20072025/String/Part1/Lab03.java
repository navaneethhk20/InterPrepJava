package Ex19072025And20072025.String.Part1;
import java.util.HashMap;
import java.util.HashSet;

public class Lab03 {
    public static void main(String[] args){
        //Print unique & not character
        String input ="Swiss";
        input =input.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
     //unique character & not unique
        HashSet<Character> hashSet = new HashSet<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)>1&& !hashSet.contains(ch)){
                System.out.println(ch+" ");
                hashSet.add(ch);
            }
        }
    }
}

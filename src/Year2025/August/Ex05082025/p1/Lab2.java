package Year2025.August.Ex05082025.p1;
import java.util.HashMap;
import java.util.ArrayList;
public class Lab2 {
    public static void main(String[] args){
        //print unique and non unique chracter
        String input ="whitefield";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1 &&!list.contains(ch)){
                System.out.print(ch+" ");
                list.add(ch);
            }
        }


    }


}

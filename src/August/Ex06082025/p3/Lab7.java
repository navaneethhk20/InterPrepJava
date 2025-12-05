package August.Ex06082025.p3;
import java.util.HashMap;
import java.util.ArrayList;
public class Lab7 {
    public static void main(String[] args) {
        String input="switchas switches que testing";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch:input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list= new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    System.out.print(ch + " ");
                    list.add(ch);
                }
            }
        }
        System.out.println();
        int middlecharnum= list.size()/2;
        char middlechar= list.get(middlecharnum);
        System.out.println(middlechar);
    }
}

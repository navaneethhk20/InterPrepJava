package Year2025.August.July.Ex14072025;

import java.util.HashMap;

public class Lab02 {
    public static void main(String[] args) {
        String str = "Learning automation is easy";
        //given a string, output the count of each vowel
        HashMap<Character,Integer> map= new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()){

            if(c=='a'|| c=='e'||c=='i' ||c=='o'||c=='u'){

                if(!map.containsKey(c)){
                    map.put(c,1);
                }
                else{
                    map.put(c,map.get(c)+1);
                }
            }

        }
        System.out.println(map);
    }
}

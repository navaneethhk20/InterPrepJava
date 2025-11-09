package November.Nov09.p1;

import java.util.HashMap;
import java.util.Map;

public class l5 {
    public static void main(String[] args) {
String input="aaaaaaaavvvvvvvrrrrrgggggg";

HashMap<Character,Integer> hashMap = new HashMap<>();
for(char ch:input.toCharArray()){
    hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
}


char maxchar=' ';
int maxcount=0;
for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
    if(entry.getValue()>maxcount){
        maxcount=entry.getValue();
        maxchar=entry.getKey();
    }
}
        System.out.println(maxchar);
        //System.out.println(maxcount);
    }
}

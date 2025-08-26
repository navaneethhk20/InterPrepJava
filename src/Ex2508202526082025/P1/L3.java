package Ex2508202526082025.P1;
import java.util.HashMap;
public class L3 {
    public static void main(String[] args) {
        String input="Ramesh Sachin Tendulkar";
      input=  input.toLowerCase();
      int reepatingcount=0;
      HashMap<Character,Integer> hashmap = new HashMap<>();
      for(char ch: input.toCharArray()) {
          if (ch != ' ') {
              hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
          }
      }

      for(int freqency: hashmap.values()){
          if(freqency>1){
              reepatingcount++;
          }
      }
        System.out.println(reepatingcount);
    }
}

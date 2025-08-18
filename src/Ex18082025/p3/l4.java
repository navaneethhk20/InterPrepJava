package Ex18082025.p3;
import java.util.HashMap;
import java.util.Map;
public class l4 {
    public static void main(String[] args) {
        int[] arr={43,54,65,76,87,98,9887,6,65,4,34,23,21,32,4,35,6,7,8,998,76,5,43};

        HashMap<Integer, Integer> hasmap = new HashMap<>();
        for(int num: arr){
            hasmap.put(num, hasmap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry:hasmap.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

package Ex252627072025.Part2_Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lab12 {
    public static void main(String[] args) {
        //Print the duplicates/repeated values

        int[] arr ={4,5,35,4,23,21,564,65,76,54,53,432,54,65,6,75,4,3,64,4,5,43,5,65,76,76,67,87};

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int num:arr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer>entry:hashmap.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

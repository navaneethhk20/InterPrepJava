package October.oct24.p2;
import java.util.TreeSet;
public class l4 {
    public static void main(String[] args) {
        int[] arr={3,8,9,5,1,5,8,0};
        int[] arr2={2,4,6,8,9,3,1,3};
        TreeSet<Integer> set = new TreeSet<>();
        for(int add: arr){
            set.add(add);
        }
        for(int add :arr2){
            set.add(add);
        }
        System.out.println(set);



    }
}

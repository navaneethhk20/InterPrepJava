package August.Ex21082025.p2;

import java.util.TreeSet;

public class L3 {
    public static void main(String[] args) {
        int []arr={4,8,1,23,63,589};
        int[] arr2={54,8,6,1,84 ,9};

        TreeSet<Integer>list= new TreeSet<>();
        for(int num: arr){
            list.add(num);
        }
        for(int num: arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

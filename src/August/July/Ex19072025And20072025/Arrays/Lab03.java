package August.July.Ex19072025And20072025.Arrays;

import java.util.TreeSet;

public class Lab03 {
    public static void main(String[] args) {
        //Find second largest and smallest in an array
        int[] arr ={4,5,354,23,21,564,65,76,54,53,432,54,65,6,75,4,3,64,45,435,65,76,76,67,87,87};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num: arr){
            treeSet.add(num);
        }
        System.out.println(treeSet);

        Integer[] unique = treeSet.toArray(new Integer[0]);

        System.out.println(unique[unique.length-2]);
        System.out.println(unique[1]);
    }
}

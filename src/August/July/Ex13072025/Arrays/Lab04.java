package August.July.Ex13072025.Arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class Lab04 {
    public static int[] merge(int[] a1, int[]b1) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : a1) {
            treeSet.add(num);
        }
        for (int num : b1) {
            treeSet.add(num);
        }
        treeSet.toArray();
        return treeSet.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {

        //Add two arrays and remove duplicate
        int[] a1 = {1, 3, 4, 6, 8, 9};
        int[] b1 = {1, 2, 5, 6, 7, 9};

        int[] result = merge(a1, b1);
        System.out.println(Arrays.toString(result));

    }

}

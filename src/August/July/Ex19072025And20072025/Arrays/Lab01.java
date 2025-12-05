package August.July.Ex19072025And20072025.Arrays;

import java.util.TreeSet;

public class Lab01 {
    public static void main(String[] args) {
        //Add two arrays and remove duplicates
        int [] arr1 ={1,2,4,6,8,7};
        int [] arr2 ={2,3,4,5,9,10};

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num: arr1){
            treeSet.add(num);
        }

        for (int num: arr2){
            treeSet.add(num);
        }
        System.out.println(treeSet);

    }
}

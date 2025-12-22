package December.Dec21.p6;

import java.util.ArrayList;

public class l2 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,2};
        int[] b={3,5,6,7,9,2};

        ArrayList<Integer> list = new ArrayList<>();
        for(int num: a){
            list.add(num);
        }

        for(int num1:b){
            if(list.contains(num1)) {
                System.out.println(num1);
            }
        }

        System.out.println();
    }
}

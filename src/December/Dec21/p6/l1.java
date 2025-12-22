package December.Dec21.p6;

import java.util.ArrayList;

public class l1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> lsit = new ArrayList<>();

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
                lsit.add(arr[i]);
            }
        }

        for(int j=0;j<=arr.length-1;j++){
            if(arr[j]%2==0){
                lsit.add(arr[j]);
            }
        }
        System.out.println(lsit);
    }
}

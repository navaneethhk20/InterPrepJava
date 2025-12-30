package December.Dec30.p1;

import java.util.ArrayList;

public class l10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        //int index=0;
        ArrayList<Integer>result= new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
                result.add(arr[i]);
            }
        }

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                result.add(arr[i]);
            }
        }
        System.out.println(result);
    }
}

package Ex02082025.p3;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Lab6 {
    public static void main(String[] args) {
        //print the common elements and indexes
        int[] arr={1,2,3,4,5,6,7,8,9,7,4,2,3};
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for(int num:arr){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println();

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" occurs in index at "+i+" and "+j);
                }
            }
        }
    }
}

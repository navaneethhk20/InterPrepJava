package Ex09092025;
import java.util.Arrays;
public class l1 {
    public static void main(String[] args){
        int[] arr={2,3,0,8,0,6,0,7,0,4,0};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<=arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}

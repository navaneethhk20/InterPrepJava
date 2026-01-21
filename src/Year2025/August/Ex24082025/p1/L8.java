package Year2025.August.Ex24082025.p1;
import java.util.Arrays;
public class L8 {
    public static void main(String[] args) {
        int [] arr={534,77,1232,653,675,8768,86754,32521,1242,4214,421,25};
        int index=0;
        for(int i=0; i<= arr.length-1;i=i+3){
           int temp =arr[i];
           arr[i]= arr[i+2];
           arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

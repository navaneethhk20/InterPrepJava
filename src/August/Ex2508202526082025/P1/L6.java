package August.Ex2508202526082025.P1;
import java.util.Arrays;
public class L6 {
    public static void main(String[] args) {
        int[] arr={423,534,6456,75,5785,867,8678,98,97,970,86,75,6,4,3};

        for(int i=0; i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

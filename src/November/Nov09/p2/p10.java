package November.Nov09.p2;

public class p10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            System.out.print(arr[start]);
            if(start != end){
                System.out.print("," + arr[end]);
            }
            if(start < end - 1){
                System.out.print(",");
            }
            start++;
            end--;
        }
    }
}

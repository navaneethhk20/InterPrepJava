package December.Dec31.p1;

public class l9 {
    public static void main(String[] args) {
        int[] arr={4,8,7,4,6,252,13,11,22,5,9,81,7,44,8,855,77,44,22,66,3,2,1};
        int target=68;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" and "+j);
                    break;
                }
            }
        }
    }
}

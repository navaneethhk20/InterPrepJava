package September.Ex16092025.p3;

public class l9 {
    public static void main(String[] args) {
        int[] arr={2,5,4,8,9,6,1};
        int target=11;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("target values are present at indecis "+i+" and "+j);
                }
            }
        }
    }
}

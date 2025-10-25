package October.oct25.p2;

public class l10 {
    public static void main(String[] args) {
        int[] arr={2,30,5,20,6,10,7,50,8,70,1};
        int target=55;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" and "+j);
                }
            }
        }
    }
}

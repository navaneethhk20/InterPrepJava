package August.Ex20250809.p2;

public class L11 {
    public static void main(String[] args) {
        //find indeces values whose sum is equals to target
        int[] arr={1,2,3,4,5,6};
        int target=8;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is sum of "+arr[i]+" and "+arr[j]+" and there indecis are "+i +" "+j);
                }
            }
        }
    }
}

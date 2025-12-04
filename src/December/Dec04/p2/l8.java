package December.Dec04.p2;

public class l8 {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,23,9,8,77,66,55,43,21};
        int target=32;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is equal to values of index is "+i+" and "+j);
                }
            }
        }
    }
}

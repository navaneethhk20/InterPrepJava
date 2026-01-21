package Year2025.Sep.Ex10092025.p2;

public class l2 {
    public static void main(String[] args) {
        int []arr= {4,6,8,9,1,2};
        int target=10;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+ " is equals to values present at "+i+" and "+j);
                }
            }
        }
    }
}

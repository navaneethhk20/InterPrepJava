package December.Dec21.p3;

public class l4 {
    public static void main(String[] args) {
        int [] arr={12,3,43,5,67,32,765,53,323,3233,34,56,76,87,54,4,32,43};
        int target=15;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" value is present at indecis "+i+" and "+j);
                }
            }
        }
    }
}

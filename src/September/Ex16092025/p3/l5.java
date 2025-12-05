package September.Ex16092025.p3;

public class l5 {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8,9,7,76,5,4,3,2,1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

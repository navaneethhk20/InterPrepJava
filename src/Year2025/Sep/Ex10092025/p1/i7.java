package Year2025.Sep.Ex10092025.p1;

public class i7 {
    public static void main(String[] args) {
        int[] arr={4,6,8,9,0,7,6,5,4,3,5,12,34,1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

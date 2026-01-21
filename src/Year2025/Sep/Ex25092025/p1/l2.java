package Year2025.Sep.Ex25092025.p1;

public class l2 {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,8,9,998,7,6,5,4,3,2,1,23,45,67,8};
        for(int i =0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

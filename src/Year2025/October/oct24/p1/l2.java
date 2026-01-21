package Year2025.October.oct24.p1;

public class l2 {
    public static void main(String[] args) {
        int [] arr={43,6,87,98,9,67,56,45,34,32,435,6,76,87,8,8967,34,5,54,4,43,456,3};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}

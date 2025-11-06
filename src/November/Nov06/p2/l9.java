package November.Nov06.p2;

public class l9 {
    public static void main(String[] args) {
        int[] arr={423,54,75,68,675,43,234,1231,2,33,12,65,432,3,65,787,6};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

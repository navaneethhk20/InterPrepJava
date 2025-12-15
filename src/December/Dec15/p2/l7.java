package December.Dec15.p2;

public class l7 {
    public static void main(String[] args) {
        int[] arr={1,2,54,35,17,28,29,92,38,364,674,47,93,94,75,674,82,19,92};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

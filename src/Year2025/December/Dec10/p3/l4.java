package Year2025.December.Dec10.p3;

public class l4 {
    public static void main(String[] args) {
        int[] arr1={3,5,6,7,8,9,2,1};
        int[] arr2={4,6,7,9,0,2,1,4};

        for(int i=0;i<=arr1.length-1;i++){
            for(int j=0;j<=arr2.length-1;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

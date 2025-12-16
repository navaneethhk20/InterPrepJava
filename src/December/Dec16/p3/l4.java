package December.Dec16.p3;

public class l4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,7,9,2};
        boolean hasduplicates=false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    hasduplicates=true;

                }
            }
        }
        System.out.println(hasduplicates);
    }
}

package Year2026.Jan.Day22;

public class l17 {
    public static void main(String[] args) {
        int[] arr={1,24,54,75,78,96,74,253,23,12,32,66,56,27,34,59,998,97,57,426,54,34,43};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}

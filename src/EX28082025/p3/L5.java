package EX28082025.p3;

public class L5 {
    public static void main(String[] args) {
        int[] arr={4,5,2,9,4,8,1};
        int target=10;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(target+ " is equals to the values present at "+i+" and "+j);
                }
            }
        }
    }
}

package Ex02082025.p3;

public class Lab11 {
    public static void main(String[] args) {
        //based on the target print index of the numbers which combined value is equal to target
        int[] arr={1,2,5,7,11};
        int target= 10;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                for(int k=i+2;k<=arr.length-1;k++) {
                    if (arr[i] + arr[j]+arr[k] == target) {
                        System.out.print(i + " indecis " + j+" and "+k);
                    }
                }
            }
        }

    }
}

package November.Nov15.p3;

public class l3 {
    public static void main(String[] args) {
        int [] arr={11,22,43,6,47,585,7,65,64,3,4,41,56,7};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is present at " + i + " and " + j);
                }
            }
        }
    }
}

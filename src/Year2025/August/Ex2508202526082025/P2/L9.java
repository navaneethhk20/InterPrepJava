package Year2025.August.Ex2508202526082025.P2;

public class L9 {
    public static void main(String[] args) {
        int[] arr={543,654,65,768,6756,45,3422,3144,35,465,76,565,4,65,32,766,8987,76};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}

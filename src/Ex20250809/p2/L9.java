package Ex20250809.p2;

public class L9 {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5,3,2,8,9};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}

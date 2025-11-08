package November.Nov08.p1;

public class l7 {
    public static void main(String[] args) {
        int[] arr={1,2,7,3,6,4,5,6,7,8,9};
        boolean hasduplicates=true;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    hasduplicates=true;
                    break;
                }else {
                    hasduplicates=false;
                    break;
                }
            }
        }
        System.out.println(hasduplicates);

    }
}

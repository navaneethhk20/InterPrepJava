package November.Nov08.p1;

public class l6 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,78,9};
        boolean hasduplicates=true;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                   hasduplicates=true;
                   break;
                }else{
                    hasduplicates=false;
                     break;
                }
            }
        }
        System.out.println(hasduplicates);
    }
}

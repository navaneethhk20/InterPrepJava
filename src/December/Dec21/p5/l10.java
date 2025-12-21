package December.Dec21.p5;

public class l10 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,6,7,4,8,9,1};
        boolean hasduplicates= false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    hasduplicates=true;
                   // break;

                }
            }
        }
        System.out.println(hasduplicates);
    }
}

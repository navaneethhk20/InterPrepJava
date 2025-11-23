package November.Nov23.p2;

public class l10 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        Boolean isduplicate=false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    isduplicate=true;
                    break;
                }
            }

        }
        System.out.println(isduplicate);
    }
}

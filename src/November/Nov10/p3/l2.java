package November.Nov10.p3;

public class l2 {
    public static void main(String[] args) {
        int[] arr={12,33,44,56,60,898,69,20,58,37,36,5,49,37,25,24,58};
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=i+1;j<=arr.length-1;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]+" is present at "+i+" and "+j);
//                }
//            }
//        }
//        int target=106;
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=i+1;j<=arr.length-1;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(target+" is equals to values present at "+i+" and "+j);
//                }
//            }
//        }
        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
               index=i;
            }
        }

        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int diff=max-min;
        System.out.println(diff);
    }
}

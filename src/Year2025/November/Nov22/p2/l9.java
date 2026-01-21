package Year2025.November.Nov22.p2;

public class l9 {
    public static void main(String[] args) {
        int [] arr={11,22,43,25,16,57,78,1,69};
        int max=arr[0];
        int min=arr[0];
      //  int index=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                //index=i;
            }
        }

        for(int j=0;j<= arr.length-1;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int diff = max-min;
        System.out.println(diff);
    }
}

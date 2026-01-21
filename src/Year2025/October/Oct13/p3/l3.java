package Year2025.October.Oct13.p3;

public class l3 {
    public static void main(String[] args) {
        int [] arr={23,54,6,8,90,4,23,594,56,78,98,3,254,65,87,54};
        int max=arr[0];
        int min=arr[0];
       // int index=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
               // index=i;
            }
        }
        for(int j=0;j<= arr.length-1;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        int diff= max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(diff);
    }
}

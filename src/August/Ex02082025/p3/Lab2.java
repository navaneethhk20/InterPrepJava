package August.Ex02082025.p3;

public class Lab2 {
    public static void main(String[] args) {
        //find the max and min in an array
        int[] arr={4,5,6,54,8,5,2,63,6,45,4,2,5,5,4,5,4,78,78,78,5,5,5,5,8,89,49,6,5,5,87};
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }
        System.out.println(max);


        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(min);
    }
}

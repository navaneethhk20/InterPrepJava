package Ex18082025.p2;

public class l3 {
    public static void main(String[] args) {
        int [] arr={4,5,8,9,4,1,2,3,6,5};
        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);

        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(min);
        System.out.println("diff = "+(max-min));
    }
}

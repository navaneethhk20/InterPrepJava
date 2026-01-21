package Year2025.August.Ex21082025.p2;

public class L12 {
    public static void main(String[] args) {
        int [] arr={4,5,2,6,9,7,1};
        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
            for (int j=0;j<index;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
            }

        System.out.println(max);
        System.out.println(min);
        System.out.println("diff "+(max-min));

    }
}

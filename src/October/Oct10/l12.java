package October.Oct10;

public class l12 {
    public static void main(String[] args) {
        int[]arr={32,56,87,28,65,97,64,54,132,4123,765,6,909,78};
        int max=arr[0];
        int min=arr[0];
int index=0;
        for(int i=0;i<= arr.length-1;i++){
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

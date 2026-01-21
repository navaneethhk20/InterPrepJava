package Year2025.August.Ex24082025.p3;

public class L2 {
    public static void main(String[] args) {
        int[] arr={19,20,21,23,24};
        int n=arr.length+1;
        int start= arr[0];
        int exp =n*(2*start+n-1)/2;
        int act=0;
        for(int num:arr){
            act=act+num;

        }
        int diff= exp-act;
        System.out.println(diff);
    }
}

package Year2025.August.Ex16082025.p2;

public class L12 {
    public static void main(String[] args) {
        int[] arr={4,5,7,8};


        int n=arr.length+1;
        int start=arr[0];
        int exp=n*(2*start+n-1)/2;
        int act=0;

        for(int num:arr){
            act=act+num;
        }
        int missing =exp-act;
        System.out.println(missing);
    }
}

package October.oct29.p2;

public class l10 {
    public static void main(String[] args) {
        int[] arr={4,6,7,8};
        int n=arr.length+1;
        int start=arr[0];
        int exp=n*(2*start+n-1)/2;
        int act=0;

        for(int num:arr){
            act=act+num;
        }

        int missing= exp-act;
        System.out.println(missing);
    }
}

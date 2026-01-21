package Year2025.October.oct24.p2;

public class l1 {
    public static void main(String[] args) {
        int[] arr={34,35,36,38};
        int n=arr.length+1;
        int start= arr[0];
        int act=0;
        int exp=n*(2*start+n-1)/2;

        for(int num:arr){
            act=act+num;
        }

        int diff=exp-act;
        System.out.println(diff);
    }
}

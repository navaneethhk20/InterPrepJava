package September.Ex16092025.p2;

public class l10 {
    public static void main(String[] args) {
        int [] arr={2,4,5,6};
        int n= arr.length+1;
        int start=arr[0];
        int expected=n*(2*start+n-1)/2;
        int act=0;
        for(int num: arr){
            act=act+num;
        }
        int missing= expected-act;
        System.out.println(missing);
    }
}

package December.Dec04.p3;

public class l3 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int n=arr.length+1;
        int start=arr[0];
        int act=0;
        int exp=n*(2*start+n-1)/2;

        for(int ar:arr){
            act=act+ar;
        }
        int diff= exp-act;
        System.out.println(diff);
    }
}

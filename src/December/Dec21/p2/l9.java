package December.Dec21.p2;

public class l9 {
    public static void main(String[] args) {

        int[] arr={1,2,4,5};
        int n=arr.length+1;
        int start=arr[0];
        int act=0;
        int exp=n*(2*start+n-1)/2;

        for(int num:arr){
            act=act+num;
        }

        int missing= exp-act;

        System.out.println(missing);

    }
}

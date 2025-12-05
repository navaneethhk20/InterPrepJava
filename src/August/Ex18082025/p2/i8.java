package August.Ex18082025.p2;

public class i8 {
    public static void main(String[] args) {
        int[] arr={12,13,14,15};
        int n= arr.length+1;
        int start=arr[0];
        int exp = n*(2*start+n-1)/2;
        int act=0;

        for(int num:arr){
            act=act+num;
        }

        int diff= exp-act;
        System.out.println(diff);
    }
}

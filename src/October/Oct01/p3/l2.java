package October.Oct01.p3;

public class l2 {
    public static void main(String[] args) {
        int[] arr={43,45,46};
        int n= arr.length+1;
        int start=arr[0];
        int exp= n*(2*start+n-1)/2;
        int act=0;
        for(int num:arr){
            act=act+num;
        }
        int diff=exp-act;
        System.out.println(diff);
    }
}

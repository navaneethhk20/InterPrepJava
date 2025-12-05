package September.Ex21092025.p3;

public class l1 {
    public static void main(String[] args) {
        int [] arr={23,24,25,27};
        int n=arr.length+1;
        int start=arr[0];
        int expected= n*(2*start+n-1)/2;
        int actual=0;
        for(int num:arr){
            actual=actual+num;
        }
        int missing = expected-actual;
        System.out.println(missing);
    }
}

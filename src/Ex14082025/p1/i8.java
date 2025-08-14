package Ex14082025.p1;

public class i8 {
    public static void main(String[] args) {
        int[] arr={75,77,78,79};
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

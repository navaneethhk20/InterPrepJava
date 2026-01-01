package January26.p1;

public class l3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        int n=arr.length+1;
        int start=arr[0];

        int act=0;
        int exp= n*(n+1)/2;

        for(int num:arr){
            act=act+num;
        }

        int missing = exp-act;

        System.out.println(missing);
    }
}

package August.Ex11082025.Part1;

public class P17 {
    public static void main(String[] args) {
        int []arr={11,12,13,14,16,17};
        int n=arr.length+1;
        int start= arr[0];
        int exp =n*(2*start+n-1)/2;
        int act=0;

        for (int num:arr){
            act= act+num;
        }

        int missing=exp-act;
        System.out.println(missing);
    }
}

package August.Ex21082025.p2;

public class L5 {
    public static void main(String[] args) {
        int[] arr={45,47,48,49,50};
        int n= arr.length+1;
        int start= arr[0];
        int exp= n*(2*start+n-1)/2;
        int act=0;

        for(int num: arr){
            act=act+num;
        }

        int diff= exp-act;
        System.out.println(diff);
    }
}

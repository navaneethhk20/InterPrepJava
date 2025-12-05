package August.Ex2508202526082025.P1;

public class L10 {
    public static void main(String[] args) {
        int [] arr={67,68,69,70,72};
        int n=arr.length+1;
        int start= arr[0];
        int exp= n*(2*start+n-1)/2;
        int act= 0;
        for(int num: arr){
            act= act+num;
        }
        int diff= exp-act;
        System.out.println(diff);
    }
}

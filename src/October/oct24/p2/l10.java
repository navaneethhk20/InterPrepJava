package October.oct24.p2;

public class l10 {
    public static void main(String[] args) {
        int num=498213;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}

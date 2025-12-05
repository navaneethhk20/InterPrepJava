package September.Ex16092025.Ex18092025;

public class l7 {
    public static void main(String[] args) {
        int num=23984;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}

package Ex19072025And20072025.General;

public class Lab07 {
    public static void main(String[] args) {
        //reverse number
        int num = 1234;
        int rev=0;
        while (num!=0){
           int rem = num%10;
          rev = rev*10+rem;
            num= num/10;
        }
        System.out.println(rev);
    }
}

package Year2025.August.EX28082025.p3;

public class L1 {
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        if(number==2){
            return true;
        }
        if(number%2==0){
            return false;
        }
        for(int i=3;i*i<=number;i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int target = 50;
        for (int i = 1; i <= target; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

package Year2025.October.oct25.p4;

public class l9 {
    public static  Boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        if(number==2){
            return true;
        }
        if(number%2==0){
            return false;
        }

        for(int i=3;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

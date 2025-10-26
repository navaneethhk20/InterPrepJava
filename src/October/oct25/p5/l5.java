package October.oct25.p5;

public class l5 {
    public static void main(String[] args) {
        int num=10;
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

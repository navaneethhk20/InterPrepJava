package September.Ex20250927.p4;

public class l10 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
                for(int k=0;k<=(2*i-1);k++){
                    System.out.print("*");
                }
                System.out.println();


        }
    }
}

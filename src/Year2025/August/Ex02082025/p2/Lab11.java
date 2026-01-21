package Year2025.August.Ex02082025.p2;

public class Lab11 {
    public static void main(String[] args) {
        //pyramid
        int row=10;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }
                for(int k=1;k<=(2*i-1);k++){
                    System.out.print("*");
                }
                System.out.println();
            }



    }
}

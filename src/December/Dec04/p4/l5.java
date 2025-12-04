package December.Dec04.p4;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       String browser=sc.next().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
            case "edge":
                System.out.println("Starting edge browser");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            case "safari":
                System.out.println("Starting safari browser");
                break;
            default:
                System.out.println("browser is not recognized");
        }
        sc.close();
    }
}

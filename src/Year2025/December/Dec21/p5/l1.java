package Year2025.December.Dec21.p5;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "edge":
                System.out.println("starting the edge browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "safari":
                System.out.println("starting the safari browser");
                break;
            default:
                System.out.println("browser is not recognized");
        }

        sc.close();
    }
}

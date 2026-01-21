package Year2025.October.Oct01.p5;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next().toLowerCase();

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
            case "iexplorer":
                System.out.println("Starting IE browser");
                break;
            case "safari":
                System.out.println("Starting safari browser");
                break;
            default:
                System.out.println("Do not recognize the browser");
        }
        sc.close();
    }
}

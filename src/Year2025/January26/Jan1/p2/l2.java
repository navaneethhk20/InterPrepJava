package Year2025.January26.Jan1.p2;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.nextLine().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("starting the chrome");
                break;
            case "edge":
                System.out.println("starting the edge");
                break;
            case "firefox":
                System.out.println("starting the firefox");
                break;
            case "safari":
                System.out.println("starting the safari");
                break;
            default:
                System.out.println("browser is not recognized");
        }
        sc.close();
    }
}

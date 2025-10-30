package October.oct29.p4;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Chrome browser is lanuching");
                break;
            case "firefox":
                System.out.println("firefox browser is lanuching");
                break;
            case "safari":
                System.out.println("safari browser is lanuching");
                break;
            case "edge":
                System.out.println("edge browser is lanuching");
                break;
            default:
                System.out.println("browser is not recognized");
        }
        sc.close();

    }
}

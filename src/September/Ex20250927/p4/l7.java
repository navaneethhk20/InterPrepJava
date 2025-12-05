package September.Ex20250927.p4;

import java.util.Scanner;

public class l7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter browser name");
        String brwoser = sc.next().toLowerCase();

        switch (brwoser){
            case "chrome":
                System.out.println("starting chrome browser");
                break;
            case "edge":
                System.out.println("starting edge browser");
                break;
            case "firefox":
                System.out.println("starting firefox browser");
                break;
            case "safari":
                System.out.println("starting safari browser");
                break;
            case "IE":
                System.out.println("starting IE browser");
                break;
            default:
                System.out.println("this browser is not supported");
        }
        sc.close();
    }
}

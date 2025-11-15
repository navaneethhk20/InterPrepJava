package November.Nov15.p5;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the browser");
        String browser=sc.nextLine().toLowerCase();

        switch(browser){
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
            default:
                System.out.println("browser is not recognized");
                break;
        }
        sc.close();
    }
}

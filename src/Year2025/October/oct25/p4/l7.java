package Year2025.October.oct25.p4;

import java.util.Scanner;

public class l7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next().toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("starting chrome");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            case  "firefox":
                System.out.println("firefox");
                break;
            default:
                System.out.println("specify correct browser");
        }
        sc.close();
    }
}

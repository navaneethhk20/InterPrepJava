package November.Nov06.p4;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome");
                break;
            case "ie":
                System.out.println("Starting IE");
                break;
            case "safari":
                System.out.println("Starting safari");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
            default:
                System.out.println("Enter the correct browser");
        }
        sc.close();
    }
}

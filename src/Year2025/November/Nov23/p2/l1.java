package Year2025.November.Nov23.p2;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser=sc.nextLine().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "safari":
                System.out.println("Starting safari");
                break;
            default:
                System.out.println("browser not recognized");
        }
        sc.close();
    }
}

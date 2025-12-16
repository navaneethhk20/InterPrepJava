package December.Dec16.p2;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.nextLine().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("starting chrome");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            default:
                System.out.println("browser not recognized");
                break;
        }
        sc.close();
    }
}

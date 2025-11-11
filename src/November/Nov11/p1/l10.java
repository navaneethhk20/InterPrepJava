package November.Nov11.p1;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the browser");
        String browser= sc.nextLine().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("starting chrome");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "ie":
                System.out.println("starting IE");
                break;
            default:
                System.out.println("browser is not recognized");
        }
        sc.close();
    }
}

package Ex30062025;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //switch for browser
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want to start");
        String bw = sc.next();
        bw =bw.toLowerCase();
        switch (bw){
            case "chrome":
                System.out.println("starting chrome");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            case "safari":
                System.out.println("starting safari");
                break;
            default:
                System.out.println("no browser selected");
        }
        sc.close();

    }
}

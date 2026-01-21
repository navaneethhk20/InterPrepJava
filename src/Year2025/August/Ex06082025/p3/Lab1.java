package Year2025.August.Ex06082025.p3;

public class Lab1 {
    public static void main(String[] args){
        String input ="Navaneeth";
        String rev ="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}

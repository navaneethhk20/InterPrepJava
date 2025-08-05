package Ex05082025.p1;

public class Lab1 {
    public static void main(String[] args) {
        //Reverse a string
        String input ="Navaneeth";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }

}

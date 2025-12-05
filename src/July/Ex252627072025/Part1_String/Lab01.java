package July.Ex252627072025.Part1_String;

public class Lab01 {
    //Write a program to reverse string without sb
    public static void main(String[] args){
        String name = "Navaneeth";
        String rev= "";
        for(int i= name.length()-1;i>=0;i--){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}

package August.July.Ex17072025.Part1.String;

public class Lab01 {
    public static void main(String[] args) {
        //Write a program to reverse a string with string builder
        String input ="Nithu";
        StringBuilder sb = new StringBuilder(input);
        String rev_input = sb.reverse().toString();
        System.out.println(rev_input);
    }
}

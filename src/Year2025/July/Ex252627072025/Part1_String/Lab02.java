package Year2025.July.Ex252627072025.Part1_String;

public class Lab02 {
    //write a program to reverse any string with sb
    public static void main(String[] args){
        String input = "Nithu";
        String rev="";
        StringBuilder sb = new StringBuilder(input);
        rev= sb.reverse().toString();
        System.out.println(rev);
    }
}

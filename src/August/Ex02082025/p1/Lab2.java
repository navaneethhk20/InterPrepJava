package August.Ex02082025.p1;

public class Lab2 {
    public static void main(String[] args) {
        //reverse a string with string builder
        String input ="assertion";
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.println(rev);

    }
}

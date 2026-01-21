package Year2025.November.Nov16.p1;

public class l7 {
    public static void main(String[] args) {
        String input = "Too hot to hoot.";


        input = input.replaceAll("[^A-Za-z]","").toLowerCase();


        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);

        if (input.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

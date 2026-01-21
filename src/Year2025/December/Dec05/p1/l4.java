package Year2025.December.Dec05.p1;

public class l4 {
    public static void main(String[] args) {
        String input="A man a plan a canal Panama.";


        input=input.trim().replaceAll("[^A-Za-z]","").toLowerCase();

        StringBuilder sb= new StringBuilder(input);
        String rev=sb.reverse().toString();
        boolean isPalindrome=input.equals(rev);

            System.out.println(isPalindrome);
        }

}

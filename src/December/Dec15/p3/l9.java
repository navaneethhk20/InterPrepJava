package December.Dec15.p3;

public class l9 {
    public static void main(String[] args) {
        String input="madam madam.2@";

        input=input.toLowerCase().replaceAll("[^A-Za-z]","");

        StringBuilder sb= new StringBuilder(input);
        String rev= sb.reverse().toString();
        System.out.println(rev);
        System.out.println(input);

        if(rev.equals(input)){
            System.out.println("palinrome");
        }else {
            System.out.println("not");
        }

    }
}

package August.July.Ex01072025;

public class Lab05 {
    public static void main(String[] args) {
        //palindrome of a string
        String name = "Madam";
        StringBuilder sb= new StringBuilder(name);
       String rev_name= sb.reverse().toString();
        System.out.println(rev_name);
       if(name.equalsIgnoreCase(rev_name)){
           System.out.println("it is a palindrome");
       }else {
           System.out.println("not a palindrome");
       }
    }
}

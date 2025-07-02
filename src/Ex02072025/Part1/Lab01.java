package Ex02072025.Part1;

public class Lab01 {
     public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 =new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s4);
        System.out.println(s4==s6);
        System.out.println(s4.equalsIgnoreCase(s6));
        System.out.println(s4.equals(s6));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
    }
}

package Ex19072025.Part2;

public class Lab05 {
    public static void main(String[] args) {
        //Input ="I Love Java Programming"
        //Output ="I Love Java gnimmargorP"
        String input ="I Love Java Programming";

        String [] words = input.split(" ");

        String lastword = words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ",words));
    }
}

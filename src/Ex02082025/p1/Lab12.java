package Ex02082025.p1;

public class Lab12 {
    public static void main(String[] args) {
        //Reverse last word from a string
        String input ="I Love Java Programming";
        String[] words= input.trim().split("\\s+");
        String lastword = words[words.length-1];

        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]=sb.reverse().toString();
        System.out.println(String.join(" ",words));

    }
}

package Year2025.Sep.Ex16092025.p2;



public class l4 {
    public static void main(String[] args) {
        String input="I Love Java Progamming";
        String[] words= input.split("\\s+");
        String lastword = words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ",words));
    }
}

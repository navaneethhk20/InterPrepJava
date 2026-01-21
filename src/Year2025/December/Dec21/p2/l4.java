package Year2025.December.Dec21.p2;

public class l4 {
    public static void main(String[] args) {
        String input="Whitefield kuruppu Mangaluru";
        String[] words =input.split("\\s+");
        String lastword =words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]=sb.reverse().toString();
        System.out.println(String.join(" ",words));
    }
}

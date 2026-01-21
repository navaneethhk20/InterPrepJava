package Year2025.December.Dec21.p2;

public class l1 {
    public static void main(String[] args) {
        String input="Rama Nagar Whitefield";

        StringBuilder sb = new StringBuilder();

        String[] words= input.trim().split("\\s+");
        String lastword= words[words.length-1];

        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }

}

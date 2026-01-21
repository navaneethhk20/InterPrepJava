package Year2025.Sep.Ex20250927.p1;

public class l10 {
    public static void main(String[] args) {
        String input="Whitedield Banglaore Nithu";
        String[] words= input.trim().split("\\s+");
        String lastword= words[words.length-1];

        StringBuilder sb = new StringBuilder();
        for (int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

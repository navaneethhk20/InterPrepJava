package Year2025.August.Ex18082025.p1;

public class l10 {
    public static void main(String[] args) {
        String input="Hosuru Nithu kumar";
        String[] words= input.split("\\s+");
        String lastword= words[words.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

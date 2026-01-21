package Year2025.August.Ex12082025;

public class p11 {
    public static void main(String[] args) {
        String input ="Hosurukoppalu Nithu Kumar";
        String[] words = input.split("\\s+");

        String lastword = words[words.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

package Year2025.August.Ex2508202526082025.P2;

public class L1 {
    public static void main(String[] args) {
        String input="Hosurukoppalu nithu Kumar";
        StringBuilder sb = new StringBuilder();
        String[] words = input.split("\\s+");
        String lastword = words[words.length-1];
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");

        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

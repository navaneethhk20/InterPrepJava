package October.Oct09;

public class l8 {
    public static void main(String[] args) {
        String input="Navaneeth Hosuru Koppalu";
        String [] words=  input.trim().split("\\s+");
        String lastword = words[words.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

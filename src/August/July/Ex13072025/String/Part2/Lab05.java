package August.July.Ex13072025.String.Part2;

public class Lab05 {
    public static void main(String[] args) {
        String name ="Banglore Whitefield Kadugodi";
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(words[words.length-1]);
        System.out.println(sb.toString());
    }
}

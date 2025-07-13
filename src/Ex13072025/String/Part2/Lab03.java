package Ex13072025.String.Part2;

public class Lab03 {
    public static void main(String[] args) {
         String input = "HosuruKopplau Kumar Navaneeth";
         String [] words =input.trim().split("\\s+");
         StringBuilder sb = new StringBuilder();
         for(int i=0;i< words.length-1;i++){
             sb.append(words[i].charAt(0)).append(".");
         }
         sb.append("").append(words[words.length-1]);
        System.out.println(sb.toString());

    }
}

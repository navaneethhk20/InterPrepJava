package Year2025.July.Ex252627072025.Part1_String;

public class Lab09 {
    public  static  void main(String[] main){
    //Print initials from full name
    String name = "Hosurukoppalu Kumar Navaneeth";

    String[] words = name.split("\\s+");
    String lastword = words[words.length-1];

    StringBuilder sb = new StringBuilder();

   for(int i=0;i<words.length-1;i++){
       sb.append(words[i].charAt(0)).append(".");
   }
   sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}

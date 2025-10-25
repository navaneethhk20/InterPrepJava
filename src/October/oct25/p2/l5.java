package October.oct25.p2;

public class l5 {
    public static void main(String[] args) {
        String input = "nithu HosuruK jhoppalu magalu rose ";
        String[] words=  input.split("\\s+");
        String lonst=words[0];
        String shortest=words[0];

        for(String word: words ){
            if(word.length()>lonst.length()){
                lonst=word;
            }
        }

        for(String word: words){
            if(word.length()<shortest.length()){
                shortest=word;
            }
        }
        System.out.println(lonst.length());
        System.out.println(shortest.length());
    }
}

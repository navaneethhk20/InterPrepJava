package November.Nov10.p3;

public class l6 {
    public static void main(String[] args) {
        String input = "Nit Hosuru koppa tesr";
        String[] words = input.split("\\s+");
        String maxstring = words[0];
        String minstirng = words[0];

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length()>maxstring.length()){
                maxstring=words[i];

            }
        }

        for(int j=0;j<=words.length-1;j++){
            if(words[j].length()<minstirng.length()){
                minstirng=words[j];

            }
        }
        System.out.println(maxstring.length());
        System.out.println(maxstring);
        System.out.println(minstirng.length());
        System.out.println(minstirng);
    }
}

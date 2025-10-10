package October.Oct10;

public class l7 {
    public static void main(String[] args) {
        String input="nithu java Whitefield Kadugodi";
        String[] words = input.split("\\s+");


        String maxWord = "";
        int maxLength = 0;

        String minWord=words[0];
        int minLength=words[0].length();

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
            }
        }

        for(String word: words){
            if(word.length()< minLength){
                minLength=word.length();
                minWord=word;
            }
        }


        System.out.println("Word with maximum characters: " + maxWord);
        System.out.println("Length: " + maxLength);

        System.out.println(minWord);
        System.out.println(minLength);
    }
}

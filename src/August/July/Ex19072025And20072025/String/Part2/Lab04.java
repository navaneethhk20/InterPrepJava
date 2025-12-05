package August.July.Ex19072025And20072025.String.Part2;

public class Lab04 {
    public static void main(String[] args) {
        //Input = "I Love Java Programming"
        //Output ="Programming Java Love I"
        String input ="I Love Java Programming";
        String[] words = input.split(" ");
        String rev = " ";
        for(int i= words.length-1;i>=0;i--){
            rev= rev + words[i]+ " ";
        }
        System.out.println(rev);

    }
}

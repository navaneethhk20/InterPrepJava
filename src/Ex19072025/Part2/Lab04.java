package Ex19072025.Part2;

import com.sun.source.doctree.SeeTree;

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

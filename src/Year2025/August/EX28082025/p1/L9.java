package Year2025.August.EX28082025.p1;

public class L9 {
    public static void main(String[] args) {
        String input="na$#van#$eeth$#hosu$#ru#$kopp$#alu";
        String substring="$#";
        int index=0;int count=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}

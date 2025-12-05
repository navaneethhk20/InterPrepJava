package August.Ex14082025.p1;

public class l21 {
    public static void main(String[] args) {
        String input="ad@#$rwewre@#$sdfsd@#$fsdfsd@#$";
        String substring = "@#$";
        int count=0;
        int index=0;
        while ((index = input.indexOf(substring,index))!=-1){
         count++;
         index= index+substring.length();
        }
        System.out.println(count);
    }
}

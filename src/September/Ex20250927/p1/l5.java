package September.Ex20250927.p1;

public class l5 {
    public static void main(String[] args) {
        String input="gd%$#fsgd%$#fgergh543poj5#$fid%#$bud#%rtcfb#%$gyu#$%ijokidcfv#$%gbh";
            String substring ="#%$";
        int index=0;
        int count=0;
        while ((index=input.indexOf(substring,index))!=-1){
            count++;
          index=index+substring.length();
        }

        System.out.println(count);

    }
}

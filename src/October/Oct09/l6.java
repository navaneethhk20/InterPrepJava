package October.Oct09;

public class l6 {
    public static void main(String[] args) {
        String input="fsdaf@#$YERG@#$Gfdhtr@#$gdstry@#$";
        String substring ="@#$";
        int index=0;
        int count=0;
        while ((index=input.indexOf(substring,index))!=-1){
            count++;
            index=substring.length()+index;
        }
        System.out.println(count);
    }
}

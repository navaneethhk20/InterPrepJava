package Year2025.August.Ex24082025.p1;

public class L7 {
    public static void main(String[] args) {
        String input="dsa@#$ytrhg@#$ioukhjmbn@#$";
        String substring= "@#$";
        int index=0;
        int count=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index = index+substring.length();
        }
        System.out.println(count);
    }
}

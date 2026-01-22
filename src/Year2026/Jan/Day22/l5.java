package Year2026.Jan.Day22;

public class l5 {
    public static void main(String[] args) {
        String input="gsdgdfsg%$#%gsdfghtry#$%$#gtrhghj$%#jty%#^Hretre@#%$^%gdfgl$%#kmre%#$";
            String substring="$%#";
            int count=0;
            int index=0;

            while((index=input.indexOf(substring,index))!=-1){
                count++;
                index=index+substring.length();
            }
        System.out.println(count);
    }
}

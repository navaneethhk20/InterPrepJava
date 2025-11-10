package November.Nov10.p1;

public class l6 {
    public static void main(String[] args) {
       String input="fsdf43verhtr35milh43biftdweq987ferhbgt643";
       String substring="43";
       int count=0;
       int index=0;
       while((index=input.indexOf(substring,index))!=-1){
           count++;
           index=index+substring.length();
        }
        System.out.println(count);
    }
}

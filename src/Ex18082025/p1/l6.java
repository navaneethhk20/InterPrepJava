package Ex18082025.p1;

public class l6 {
    public static void main(String[] args) {
        String input="ab%^&*cdef%^&*g$%^&*hikj$%^&f$%d$%^&so$%^&itwer$%^&uo";
        String substring="$%^&";
        int count=0;
        int index=0;
        while((index=input.indexOf(substring, index))!=-1){
            count++;
            index= index+substring.length();
        }
        System.out.println(count);
    }
}

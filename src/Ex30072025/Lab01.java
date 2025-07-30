package Ex30072025;

public class Lab01 {
    public static void main(String[] args){
        String input ="hosurukoppalu";
        String rev ="";
        for(int i=input.length()-1;i>=0;i--){
            rev= rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}

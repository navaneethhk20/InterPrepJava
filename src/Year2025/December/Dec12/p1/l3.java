package Year2025.December.Dec12.p1;

public class l3 {

    public static void main(String[] args){
        String input="Hosuru";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}

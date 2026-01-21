package Year2025.November.Nov23.p3;

public class l1 {
    public static void main(String[] args) {
        String input="21Too hot to hoot.12";

input= input.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
       boolean ispalin= input.equals(rev);
        System.out.println(ispalin);
        System.out.println(rev);
        System.out.println(input);


    }
}

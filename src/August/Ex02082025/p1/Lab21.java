package August.Ex02082025.p1;

public class Lab21 {
    public static void main(String[] args) {
        //print common character index in a string
        String input ="madam";

        for(int i=0;i<=input.length()-1;i++){
            for(int j=i+1;j<=input.length()-1;j++){
                if(input.charAt(i)==input.charAt(j)) {
                    System.out.println("repeating character is: "+input.charAt(i)+" at the index : "+i+" & "+j);
                }
            }
        }
    }
}

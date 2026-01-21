package Year2025.August.Ex02082025.p1;

public class Lab20 {
    public static void main(String[] args) {
        //swap character in a stirng
        String input ="gold";
        //output:ogdl
       char[] chars= input.toCharArray();
       for(int i=0;i<=input.length()-1;i=i+2) {
           char temp = chars[i];
           chars[i] = chars[i+1];
           chars[i+1] = temp;
       }
       String re= new String(chars);
        System.out.println(re);

    }
}

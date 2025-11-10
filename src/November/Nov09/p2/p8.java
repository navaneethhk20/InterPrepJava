package November.Nov09.p2;



public class p8 {
    public static void main(String[] args) {
        String input="nithu";
        char[] ch=input.toCharArray();

            char temp=ch[0];
            ch[0]=ch[ch.length-1];
            ch[ch.length-1]=temp;

        StringBuilder sb= new StringBuilder();
        for(char cha: ch){
            sb.append(cha);
        }
        System.out.println(sb.toString());
    }
}

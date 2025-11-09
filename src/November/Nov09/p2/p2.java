package November.Nov09.p2;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        String input="nacre";
        char []ch= input.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(ch);

        for(int i=0;i<=ch.length-1;i++){
            for(int j=i+1;j<=ch.length-1;j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}

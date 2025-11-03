package November.Nov03.p1.p2;

public class l6 {
    public static void main(String[] args) {
        String input="grgi45bgrpojhr54oiytepi345klmndbs45tdkjsg34toijherw34oiohgre5knger345";
                String substring="345";
                int count=0;
                int index=0;
                while((index=input.indexOf(substring,index))!=-1){
                    count++;
                    index=index+substring.length();
                }
        System.out.println(count);
    }
}

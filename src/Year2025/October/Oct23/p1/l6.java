package Year2025.October.Oct23.p1;

public class l6 {
    public static void main(String[] args) {
        String input="gf54vdsfk45gkpdofg54bgdsfg45igoerg89gdfb45gr34g4534";
        String substring="45";
        int index=0;
        int count=0;
        while ((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}

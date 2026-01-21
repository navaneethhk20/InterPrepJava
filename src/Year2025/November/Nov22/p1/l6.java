package Year2025.November.Nov22.p1;

public class l6 {
    public static void main(String[] args) {

        String input="gersg34ghytj635hfd543hiu8534nbdsg875342fw3234ydfsfd534";
        String substirng="34";

        int count=0,index=0;
        while((index=input.indexOf(substirng,index))!=-1){
               count++;
               index=substirng.length()+index;

        }
        System.out.println(count);
    }
}

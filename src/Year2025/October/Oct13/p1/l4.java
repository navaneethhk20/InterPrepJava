package Year2025.October.Oct13.p1;

public class l4 {
    public static void main(String[] args) {
        String input="fwefef34hjkol54rdlk34bhjin#$l34";
        String substirng="34";
       int index=0;
        int count=0;

        while((index=input.indexOf(substirng,index))!=-1){
            count++;
            index=index+substirng.length();
        }
        System.out.println(count);

    }
}

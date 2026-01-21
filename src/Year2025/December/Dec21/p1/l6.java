package Year2025.December.Dec21.p1;

public class l6 {
    public static void main(String[] args) {
        String input="bvgt@#$%rgfbvg@#$%ftryuio@#$%^uytrewd@#$%scvfgh#$%^jyutr#$%^e";
        String substirng ="#$";
        int count=0;
        int index=0;

        while((index=input.indexOf(substirng,index))!=-1){
             count++;
             index=index+substirng.length();
        }
        System.out.println(count);
    }
}

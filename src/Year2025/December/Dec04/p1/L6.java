package Year2025.December.Dec04.p1;

public class L6 {
    public static void main(String[] args) {
        String input="dcf456ghju4567kilo456;p456lokjh5464gfdcxfghyj45675ukilo4567543kjhbgvfd675vgbhjk4567l";
        String substring="456";
        int count=0;
        int index=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}

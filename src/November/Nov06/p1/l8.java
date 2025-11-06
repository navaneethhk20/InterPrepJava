package November.Nov06.p1;

public class l8 {
    public static void main(String[] args) {
        String input="gergtwr5342Gewrgewy456gerhyrt634dfhte45634bdfhyrty456hsgetrkyt876badfg43654";
        String substring="456";

        int count=0;
        int index=0;
        while((index=input.indexOf(substring,index))!=0-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}

package December.Dec04.p2;

public class L6 {
    public static void main(String[] args) {
        String input="I Love Java Programming";
        String[] words= input.split("\\s+");
        String lastword= words[words.length-1];

        StringBuilder sb = new StringBuilder(lastword);
        for(int i=0;i< words.length-1;i++){
           words[words.length-1]=sb.reverse().toString();

        }
        System.out.println(String.join(" ",words));
    }
}

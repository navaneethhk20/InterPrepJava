package November.Nov22.p3;

import java.util.HashSet;

public class l4 {
    public static void main(String[] args) {
        String[] input={"Fesd","twq","bty","vsxvwq","fqwf"};
        String[] in2={"fwd","fwqe","fqw4","twq","qwqw"};

        HashSet<String> set = new HashSet<>();
        for(String coom: in2){
            set.add(coom);
        }

        for(String com1: input){
            set.add(com1);
        }

        System.out.println(set);
    }
}

package Year2025.January26.Jan1.p1;

import java.util.HashSet;

public class l2 {
    public static void main(String[] args) {
        String[] arr1={"one","two","three","four","oloy","reww"};
        String[] arr2={"tertr", "uty","three","rwr","qwe"};

        HashSet<String> set = new HashSet<>();
        for(String add:arr1){
            set.add(add);
        }

        for(String add:arr2){
            set.add(add);
        }
        System.out.println(set);
    }
}

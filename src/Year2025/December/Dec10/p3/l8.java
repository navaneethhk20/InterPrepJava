package Year2025.December.Dec10.p3;

import java.util.HashSet;

public class l8 {
    public static void main(String[] args) {
        String[] arr1={"rew","vs","uy","sAads"};
        String[] arr2={"fwe","hy6t","uy","aww"};

        HashSet<String> set = new HashSet<>();
        for(String num:arr1){
            set.add(num);
        }

        for(String num2: arr2){
            set.add(num2);
        }

        System.out.println(set);
    }
}

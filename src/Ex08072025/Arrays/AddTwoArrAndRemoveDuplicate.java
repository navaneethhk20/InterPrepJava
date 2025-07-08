package Ex08072025.Arrays;


import java.util.HashSet;
import java.util.Arrays;

public class AddTwoArrAndRemoveDuplicate {

    public static int[] addR() {
            int[] arr1 = {1, 2, 4, 6, 8};
            int[] arr2 = {3, 4, 5, 7, 9, 8};
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : arr1) {
            uniqueElements.add(num);
        }

        for (int num : arr2) {
            uniqueElements.add(num);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }

     Arrays.sort(result);

        return result;


}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addR()));

    }
}

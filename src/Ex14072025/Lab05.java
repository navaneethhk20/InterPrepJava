package Ex14072025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lab05 {
    public static void findCommonElementsUsingHashSet(String[] arr1, String[] arr2) {

        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));

        Set<String> commonElements = new HashSet<>();

        for (String element : arr2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
    public static void main(String[] args) {
        String[] arr1 = {"one", "two", "five", "nine", "eight"};
        String[] arr2 = {"one", "four", "five", "eight", "ten"};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));


        findCommonElementsUsingHashSet(arr1, arr2);
    }

}

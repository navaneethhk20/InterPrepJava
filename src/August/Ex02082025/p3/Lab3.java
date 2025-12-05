package August.Ex02082025.p3;

public class Lab3 {
    public static void main(String[] args) {
        //sort and find second largest &smallest in an array
        int[] arr={4,5,6,54,54,52,32,63,52,653,65,6,6,65,69,9,68,85,89,9,86,95,7,47,47};
        int temp=arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);
    }
}

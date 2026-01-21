package Year2025.August.Ex11082025.Part1;

public class P13 {
    public static void main(String[] args) {
        int [] arr={55,45,88,77,44,66,33,22,55,44,112,21,44};

        int min=arr[0];
        int max=arr[0];
        int index=0;
        for(int i=0;i<= arr.length-1;i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
            for (int j = 0; j < index; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("diff= "+(max-min));
    }
}

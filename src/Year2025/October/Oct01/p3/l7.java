package Year2025.October.Oct01.p3;

public class l7 {
    public static void main(String[] args) {
        int[] arr = {543, 654, 756, 643, 12, 423, 634, 756, 86, 879, 98, 89, 98, 6, 3432, 32, 3567, 758, 869, 987, 9876,2, 43, 420};
        int max = arr[0];
        int min = arr[0];
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("diff is "+(max-min));
    }

}


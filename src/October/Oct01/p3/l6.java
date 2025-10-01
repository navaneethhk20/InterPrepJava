package October.Oct01.p3;

public class l6 {
    public static void main(String[] args) {
        int[] arr={543,654,756,643,12,423,634,756,86,879,98,89,98,6,32432,32,3567,758,869,987,9876,43,420};
       int target=686;
        for(int i=0;i<=arr.length-1;i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " and " + j);
                }
            }
        }
    }
}

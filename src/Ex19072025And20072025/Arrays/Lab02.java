package Ex19072025And20072025.Arrays;

public class Lab02 {
    public static void main(String[] args) {
        //Find Maximum and minimum in an array
        int[] arr ={4,5,354,23,21,564,65,76,54,53,432,54,65,6,75,4,3,64,45,435,65,76,76,67,87,87};

        int max =arr[0];
        int min =arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

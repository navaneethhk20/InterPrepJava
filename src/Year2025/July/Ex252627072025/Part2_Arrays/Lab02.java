package Year2025.July.Ex252627072025.Part2_Arrays;

public class Lab02 {
    public static void main(String[] args){
        //reverse an array
        int [] arr={1,2,3,4,5,6,7,8,9,10};

        int [] rev=new int [arr.length];

        for(int i=0;i<arr.length;i++){
             rev[i] = arr[arr.length-1-i];
        }

        for (int i=0;i<rev.length;i++) {
            System.out.print(rev[i]+" ");
        }
        //Simple one

//        for (int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
    }
}

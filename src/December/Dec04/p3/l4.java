package December.Dec04.p3;

public class l4 {
    public static void main(String[] args) {
        int [] arr={22,44,56,67,78,95,43,72,29,6,56,2,16,24};

        for(int i=0;i<=arr.length-1;i++){
            for( int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" and "+i+" and "+j);
                }
            }
        }

    }
}

package August.July.Ex13072025.Arrays;

public class Lab01 {
    public static void main(String[] args) {
        //Find max and min in an array
        int [] age = {41,6,2,41,26,8,9,8,6,5,88,24,85,3,5};
        int max= age[0];
        int min =age[0];
        for(int i=0;i<age.length;i++){
          if(age[i]>max){
              max=age[i];
          }
        }
        for (int j=0;j< age.length;j++){
            if(age[j]<min){
                min =age[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

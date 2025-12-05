package August.Ex02082025.p2;

public class Lab08 {
    public static void main(String[] args) {
        //fibonacci
    int num=10;
    int first=0;
    int second=1;

      if(num>=1){
        System.out.println(first);
    }
      if(num>=2){
          System.out.println(second);
    }
      for(int i=3;i<=num;i++){
        int next= first+second;
        System.out.println(next);
        first =second;
        second =next;

    }





    }
}

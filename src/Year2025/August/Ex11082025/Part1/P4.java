package Year2025.August.Ex11082025.Part1;

public class P4 {
    public static void main(String[] args) {
String input ="abc@#$cdf@#$gdf@#$gdfg@#$HTE@#$";
String substring="@#$";
int index=0;
int count =0;
while((index=input.indexOf(substring,index))!=-1){
    count++;
    index= index+substring.length();
}

        System.out.println(count);

    }
}

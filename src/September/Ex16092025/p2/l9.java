package September.Ex16092025.p2;

import java.util.TreeSet;

public class l9 {
    public static void main(String[] args) {
        String [] st={"GFD","Gds","ter","GDgdf","Treg"};
        String[] at={"FSD","hgsdf","Greg","Gerg","ter"};

       TreeSet<String> hashMap = new TreeSet<>();
        for(String common: st){
            hashMap.add(common);
        }

        for(String common: at){
            hashMap.add(common);
            }
        System.out.println(hashMap);


    }
}

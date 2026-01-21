package Year2025.August.July.Ex30072025;

public class Test31 {
    public static void main(String[] args){
        //Input: nums = [2,7,11,15], target = 9 Output: [0,1]Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] nums ={2,7,11,15};
        int target=22;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("value of target is index of: "+i+" "+j);
                }
            }
        }
    }
}

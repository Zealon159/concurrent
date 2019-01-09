package cn.zealon.leecode;

/**
 * @auther: Zealon
 * @Date: 2018-10-16 14:40
 */
public class Case0 {

    public static void splitInt(){
        int num = 12345678;

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] number = {0,1,5,10,6,8};
        int[] nums = twoSum(number,8);
        if(nums!=null) {
            System.out.println(nums[0] + "," + nums[1]);
        }
    }
}

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int tar = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                tar = nums[i] + nums[j];
                if(tar == target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] arr = {1,2,3,4,5};
        int tak = 7;
        System.out.print(Arrays.toString(sol.twoSum(arr,tak)));
        
        
    }
}

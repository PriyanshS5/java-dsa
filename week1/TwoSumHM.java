import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHM {
    public int[] sum(int[] nums, int target){
        HashMap <Integer, Integer> summy = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            int cmplmnt  = target - nums[i];
            if(summy.containsKey(cmplmnt)){
                return new int[]{summy.get(cmplmnt),i};
            }
            summy.put(nums[i], i);
        }
        return new int[]{-1,-1}; 
    }
    public static void main(String[] args) {
        TwoSumHM sol = new TwoSumHM();
        int nums[] = {2,7,11,15};
        int tar = 9;
        System.out.println(Arrays.toString(sol.sum(nums, tar)));
    }
}

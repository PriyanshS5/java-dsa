import java.util.HashSet;

public class ContainsDuplicate {
    public boolean duplicate(int[] nums){
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(sol.duplicate(nums));
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums){
            if (seen.contains(num)){
                System.out.println("Duplicate: "+ num);
            }
            else{
            seen.add(num);
            System.out.println("Not a Duplicate");
            }
        }
        
    }
}

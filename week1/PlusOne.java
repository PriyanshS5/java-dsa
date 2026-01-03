import java.util.Arrays;

public class PlusOne {
    public int[] res(int[] nums){
        int n = nums.length;

        for(int i = n-1; i>= 0 ; i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] res = new int[nums.length+1];
        res[0] = 1;
        return res;
    }
    
    public static void main(String[] args) {
        PlusOne sol = new PlusOne();
        int[] arr =  {4,3,2,9 };
        System.out.println(Arrays.toString(sol.res(arr)));
    }
}

import java.util.Arrays;

public class RunningSum1 {
    public int[] summ(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            if(i == 0){
                arr[i] = nums[i];
            }
            else{
                arr[i] = arr[i-1] + nums[i];
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        RunningSum1 solu = new RunningSum1();
        int[] aura = {1,1,1,1,1};
        System.out.println(Arrays.toString(solu.summ(aura)));
    }
}

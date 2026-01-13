public class MaxSubArrKadane {
    public int subby(int[] nums){
        int maxSum = nums[0];
        int CuSum = nums[0];
        for(int i = 0; i<nums.length; i++){
            CuSum = Math.max(nums[i], CuSum + nums[i]);
            maxSum = Math.max(maxSum, CuSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSubArrKadane rol = new MaxSubArrKadane();
        int[] arr = {-1,-6,9,5,-1,2,1,-3};
        System.out.println(rol.subby(arr));
    }
}

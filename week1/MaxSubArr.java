public class MaxSubArr {
    public int maxi(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        for(int st =0; st<nums.length;st++){
            int sum = 0 ;
            for(int end = st; end<nums.length; end++){
                sum += nums[end];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArr yos = new MaxSubArr();
        int[] arr = {-1,-6,9,5,-1,2,1,-3};
        System.out.println(yos.maxi(arr));
    }
}

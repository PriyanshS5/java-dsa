public class RemoveDuplicatesSorted {
    public int dope(int[] nums ){
        if(nums.length == 0) return 0;

        int  k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSorted sol = new RemoveDuplicatesSorted();
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,9,9};
        System.out.println(sol.dope(arr));
    }
    
}

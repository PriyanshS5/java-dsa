public class RemoveElement {
    public int elem(int[] nums, int val){
        int k = 0;
        int pos = 0; 
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[pos] = nums[i];
                pos++;
                k++;
            }
        }
        while(pos<nums.length){
            nums[pos] = val;
            pos++;
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveElement soll = new RemoveElement();
        int[] arr = {1,2,2,4,5,2};
        int val = 2;
        System.out.println(soll.elem(arr, val));
        
    }
}

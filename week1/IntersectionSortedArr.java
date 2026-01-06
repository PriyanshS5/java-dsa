import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionSortedArr {
    public int[] interCourse(int[] nums1, int[] nums2){
        HashSet<Integer> setting = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int num: nums1){
            setting.add(num);
        }
        for(int num : nums2){
            if(setting.contains(num)){
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];
        int i = 0;
        for(int num: result){
        arr[i++] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        IntersectionSortedArr sol = new IntersectionSortedArr();
        int[] arr = {1,2,2,1};
        int[] arrr = {1,2,2};

        System.out.println(Arrays.toString(sol.interCourse(arr, arrr)));
    }
}

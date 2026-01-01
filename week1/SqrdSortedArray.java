import java.util.*;
import java.util.Arrays;

public class SqrdSortedArray {

    public int[] solution(int[] arr){
        int n = arr.length;
        int [] sorted = new int [n];
        int l = 0;
        int r = n-1;
        int pos = n-1;

        while(l<=r){
            int left = arr[l]* arr[l];
            int right = arr[r] * arr[r];

            if (left > right){
                sorted[pos] = left;
                l++;
            }
            else{
                sorted[pos]=right;
                r--;
            }
            pos--;
        }
        
        return sorted;
    }

    public static void main(String[] args) {
        SqrdSortedArray solve = new SqrdSortedArray();
        int [] arr = {22,33,44,55,90};
        System.out.println(Arrays.toString(solve.solution(arr)));
    }
}
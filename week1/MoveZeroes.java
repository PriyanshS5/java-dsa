import java.util.Arrays;

public class MoveZeroes {
    public void moveZ(int[] arr){
        int n = arr.length;
        int ins = 0;
        for (int i =0; i < n; i++){
            if(arr[i] != 0){
                arr[ins] = arr[i];
                ins++;
            }
        }
        while(ins < n){
            arr[ins] =0;
            ins++;
        }
    }
    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();
        int arr[] = {0,1,0,3,1,2};
        sol.moveZ(arr);
        System.out.print(Arrays.toString(arr));
    }
}

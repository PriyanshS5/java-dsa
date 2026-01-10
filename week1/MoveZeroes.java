import java.util.Arrays;

public class MoveZeroes {
    public void moveZs(int[] arr){
        int ins = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 ){
                arr[ins] = arr[i];
                ins++;
            }
        }
        while (ins < arr.length){
            arr[ins] = 0;
            ins++;
        }
    }
    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();
        int arr[] = {0,1,0,3,1,2};
        sol.moveZs(arr);
        System.out.print(Arrays.toString(arr));
    }
}

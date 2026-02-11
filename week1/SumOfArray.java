public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }

        System.out.println( summ);

        
    }
}
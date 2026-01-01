public class EvenDigitNumbers {
    public int findNumbers(int[] nums){
        int output =0;
        for (int number: nums){
            int count =0;
            int temp = number;
            while(temp != 0){
                temp/=10;
                count++;
            }
            if (count%2 == 0){
                output++;
                }

        }
        return output;
    }

    public static void main(String[] args) {
        EvenDigitNumbers sol = new EvenDigitNumbers();
        int[] acc = {123,77,91829,8888};
        System.out.println(sol.findNumbers(acc));
    }
}

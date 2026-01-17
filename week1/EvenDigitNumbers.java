public class EvenDigitNumbers {
    public int findNumber(int[] nums){
        int output = 0;
        for (int num : nums){
            int count = 0;
            while(num != 0){
            num /= 10;
            count++;
            }
            if(count % 2 == 0){
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        EvenDigitNumbers sol = new EvenDigitNumbers();
        int[] acc = {123,745,91829,8888};
        System.out.println(sol.findNumber(acc));
    }
}

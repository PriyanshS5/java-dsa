public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxSum= 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
    maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }

    public static void main(String []args){
        RichestCustomerWealth sol = new RichestCustomerWealth();
        int[][] acc = {{1,2,3},{8,9,3},{10,3,4,5}};
        System.out.println(sol.maximumWealth(acc));
    }
}

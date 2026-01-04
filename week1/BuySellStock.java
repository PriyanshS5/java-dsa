public class BuySellStock {
    public int stock(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if(price < min){
                min = price;
            }
            else{
                max = Math.max(max, price - min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BuySellStock sol = new BuySellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(sol.stock(prices));
    }
}

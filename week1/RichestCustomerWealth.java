public class RichestCustomerWealth {
    public int maximaWealth(int[][] accounts) {
       int maxPaisa = 0;
       for (int[] customer : accounts){
        int sum = 0;    
        for(int paisa : customer){
            sum += paisa;
            maxPaisa = Math.max(maxPaisa, sum);
        }
       }
       return maxPaisa;

    }

    public static void main(String []args){
        RichestCustomerWealth soll = new RichestCustomerWealth();
        int[][] acc = {{1,2,3},{8,9,3},{10,3,4,5}};
        System.out.println(soll.maximaWealth(acc));
    }
}

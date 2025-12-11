/*you want to maximize your profit by choosing a single day to buy one stock and choosing a different day to sell that stock.
return the maximum profit you can make form this transaction
 */
public class P_02 {
    public static void main(String[] args) {
        int[] arr={4,2,7,8,3,6,2,9};
        int n = arr.length;
        int profit=0,maxprofit=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                profit=arr[j]-arr[i];
                if(profit>maxprofit)
                    maxprofit=profit;
            }
        }
        System.out.println("Max profit = "+maxprofit);
    }
}

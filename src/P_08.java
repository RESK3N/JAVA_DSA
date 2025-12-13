import java.util.*;

public class P_08 {
    public static int[] findBest(int[] arr, int k) {
        int n = arr.length;
        int[] window = new int[n -k+1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (i >= k) sum = sum - arr[i - k];
            if (i >= k - 1) window[i - k + 1] = sum;
        }
        int []left = new int[n-k+1];
        int best=0;
        for (int i=0;i<window.length;i++){
            if(window[i]>window[best]){
                best=i;
            }
            left[i]=best;
        }
        System.out.println(Arrays.toString(left));
        int []right= new int[n-k];
        best=n-k;
        for(int i=window.length-1;i>=0;i--){
            if(window[i]>=window[best]){
                best=i;
            }
            right[i]=best;
        }
        System.out.println(Arrays.toString(right));
return window;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 6, 7, 5, 1};
        int k = 4;

        int[] ans = findBest(nums, k);

        System.out.println("Sums of subarrays of size " + k + ":");
        System.out.println(Arrays.toString(ans));
    }
}

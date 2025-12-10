/*Java program to find if a number has exactly 3 divisors
 A number has exactly three divisors if it is a perfect square of a prime number

 */
import java.util.*;
public class P_01 {
    static boolean isPerfect(int n){
        int root = (int) Math.sqrt(n);
        if(root*root != n) {
            return false;
        }
        else
            return isPrime(root);
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check : ");
        int num = sc.nextInt();
        if(isPerfect(num)){
            System.out.println(num+" has exactly 3 divisors");
        }else{
            System.out.println("NO! "+num+" doesn't have exactly 3 divisors");
        }
    }
}

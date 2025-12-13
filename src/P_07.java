public class P_07 {
    public static int steps(int n){
        int count=0;
        int d=2;
        while(n>1){
            while(n%d==0){
                count=count+d;
                n=n/d;
            }
            d++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(steps(25));
    }
}

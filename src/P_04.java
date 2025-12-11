public class P_04 {
    public static int sum(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return sum(n-1)+sum(n-2);
    }
    public static void main(String[] args) {
        System.out.println(sum(36));

    }
}

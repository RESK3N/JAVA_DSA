import java.util.*;

public class P_06 {
    public static int toInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            int curr=map.get(s.charAt(i));
            if(i+1<n){
                int next=map.get(s.charAt(i+1));
                if(next>curr){
                    total-=curr;
                    continue;
                }
            }
            total+=curr;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(toInt("XIV"));
    }
}

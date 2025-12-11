//word separator
public class P_03 {
    public static void main(String[] args) {
        String str= "wordDictCatDogBiscuit";
        int n=str.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str.charAt(i))){
                str=str.substring(0,i)+" "+str.substring(i,n);
                i++;
                n++;
            }
        }
        System.out.println(str);
    }
}

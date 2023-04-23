package s2023423;

public class Case1 {
    public static void main(String[] args) {
        int[] arr = {2020,0504,1101};
        String s1 = ArryinttoString(arr);
        System.out.print(s1);
    }
    public static String ArryinttoString(int[] arr){
        String s="s:[";
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        s+="]";
        return s;
    }
}

package s2023423;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        int n = 3;//总共能实验的次数
        Scanner sc = new Scanner(System.in);
        boolean TF = true;
        for (int i = 0; i < n&&TF; i++) {
            //开始创建用户，手动输入
            StringBuilder s1 = new StringBuilder();
            s1 = s1.append(sc.next());
            String s = s1.toString();
            //生成默认密码，即用户名的翻转
            String s2 = s1.reverse().toString();
            //输入密码，查看是否正确
            String key = sc.next();
            if(s2.equals(key)){
                System.out.println("恭喜您登录成功!");
                TF = false;
            }
            else if(i!=n-1){
                System.out.println("用户名或密码错误,您现在还有"+(n-i-1)+"次机会");
            }
            if(i==n-1&&TF){
                System.out.println("登陆失败");
            }
        }
    }
}

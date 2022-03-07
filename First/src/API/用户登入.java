package API;

import java.util.Scanner;

public class 用户登入 {
    public static void main(String[] args) {
        String username="李任远";
        String userpassword="lwj";
        for(int i=0;i<=3;i++){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入用户名：");
        String name=sc.nextLine();
        System.out.println("输入密码：");
        String password=sc.nextLine();
        if(name.equals(username)&&password.equals(userpassword)){
            System.out.println("hahha");
            break;
        }else{
            System.out.println("sb,密码都能忘");
        }
    }
    }
}

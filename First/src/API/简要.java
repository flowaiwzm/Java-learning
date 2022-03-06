package API;

import java.util.Scanner;

public class 简要 {
    // API：应用程序编程接口（Java当中指的就是jdk中提供的各种功能的Java类，将这些底层实现封装起来）
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line=sc.nextLine();
        System.out.println(line);
        // 字符串的特点不可变性，一旦创建后就不被更改
        // 虽然string的值不可变，但是可以共享
        // 字符串效果相当于字符串数组（char[])，但底层原理是字节数组
    }
}

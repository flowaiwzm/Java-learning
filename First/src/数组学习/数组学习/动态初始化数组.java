package 数组学习;

public class 动态初始化数组 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        // new为数组申请内存空间 int即数组中元素类型
        //数组元素访问数组名【索引】1.从零开始，连续，逐渐加一
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //java中的内存分配1.数组在初始化是会为储存空间添加默认值
        // 其中int[] arr为轧内存（存储局部变量）而new int[3]为堆内存（存储new出来的内容像实体与对象）
        arr[0]=200;
        arr[2]=100;
        System.out.println(arr[0]);
        System.out.println(arr[2]);
    }
    
}

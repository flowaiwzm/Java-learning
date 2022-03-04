package 方法学习;

public class 方法参数传递 {
    public static void main(String[] args) {
        int[] arr={20,30,40};
        System.out.println("调用方法之前："+arr[1]);
        change(arr);//加载到栽内存，执行完后退出内存
        System.out.println("调用方法之后："+arr[1]);
    }
    public static void change(int[] arr){
        arr[1]=100;
    }
    // 引用传递进去的时实参对应的内存地址，指针常量指向的内存单元可以修改，但指向不能修改
}

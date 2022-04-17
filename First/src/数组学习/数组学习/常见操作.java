package 数组学习;

public class 常见操作 {
    public static void main(String[] args) {
        // 遍历
        // 静态数组初始化
        int[] arr={11,22,33,44,55};
        // 通过循环对数组进行遍历操作
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
        // 通过for-each循环对数组进行循环
        for(int i :arr){
            System.out.println(i);
        }
    }
    
}

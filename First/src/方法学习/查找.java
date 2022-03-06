package 方法学习;
import java.util.Scanner;

public class 查找 {
    // 如果对应的索引不存在，我们一般返回一个负数一般用-1来表示
    public static void main(String[] args) {
        int[] arr={132,4,54,67,8,9};
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入你要查找的数据: ");
    int num=sc.nextInt();
    int index=-1;//定义一个索引变量，初始化值为-1
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            index=i;
            break;
        }
    }
    System.out.println("index="+index);
    }
// 也可使用函数方法（int[] arr, int num）,只要调用该方法即可；


    
}

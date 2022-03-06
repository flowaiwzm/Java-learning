package 方法学习;

import java.util.Scanner;

public class 评委打分 { 
    // 定义动态数组长度为6
    // 键盘打入分数
    // 利用循环改进
    // 定义方法获取数组最大值
    // 定义方法求和与求平均值
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<arr.length;x++){
            System.out.println("输入第"+(x+1)+"为评委打分：");
            arr[x]=sc.nextInt();
        }
        int max=getmax(arr);
        int min=getmin(arr);
        int sum=sums(arr);
        // System.out.println(sum);
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("得分为："+avg);
    }
    public static int getmax(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getmin(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int sums(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
        
    }
    // public static int score() {
    //     int score
    // }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<=arr.length;i++){
            if(i==arr.length){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

    
}

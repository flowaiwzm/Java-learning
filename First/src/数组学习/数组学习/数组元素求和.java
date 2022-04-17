package 数组学习;

public class 数组元素求和 {
    public static void main(String[] args) {
        // 求和的元素各位和十位都不能为7且只能时偶数
        // 定义一个数组，用静态初始化完成数组元素的初始化
        // 定义一个求和变量，初始化值为0
        // 遍历数组获取每个元素的值
        // 判断元素是否满足条件
        int[] arr={68,474,3489,878435,248884,9849,6372,6437};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10!=7 && arr[i]/10%10!=7&&arr[i]%2==0 ){
                sum+=arr[i];
            }
        }
        System.out.println("sum="+sum);
    }
}

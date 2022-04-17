package 数组学习;

public class 数组内容相同 {
    // 判断两个数组内容是否相同
    // 定义一个方法，返回值类型是：boolean 参数 int[]arr int[] arr2
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr2={1,2,3,4,5,6};
        boolean flag=compare(arr,arr2);
        System.out.println(flag);
    }
    public static boolean compare(int[] arr,int[] arr2){
        if(arr.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
}

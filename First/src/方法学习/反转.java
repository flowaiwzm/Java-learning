package 方法学习;

public class 反转 {
    // 将数组中的元素类似交换
    public static void main(String[] args) {
        int[] arr={23,4,5,6,7,8};
        exchange(arr);
        print(arr);

    }
    public static void exchange(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
               System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }

    
}

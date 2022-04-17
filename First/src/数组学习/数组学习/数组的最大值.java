package 数组学习;

public class 数组的最大值 {
    public static void main(String[] args) {
        int[] arr={20,30,50,596,940};
       int max=getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=0;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }
}

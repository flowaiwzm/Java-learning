package 数组学习;

public class 数组的遍历 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Sb");
        System.out.print("hello");
        System.out.print("Sb");
        int[] arr={11,22,33,44,55};
        printarr(arr);
    }
    public static void printarr(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
            System.out.print(arr[x]);}
            else{
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }
}

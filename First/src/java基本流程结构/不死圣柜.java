package java基本流程结构;

public class 不死圣柜 {
    public static void main(String[] args) {
        // int sum=0;
        int[] arr=new int[20];
        // for(int i=0;i<100;i++){
        //     if(i%2==0){
        //         sum+=i;
        //     }
        //     System.out.println("sum="+sum);
        arr[0]=1;
        arr[1]=1;
        // arr[2]=arr[1]+arr[0]
        // arr[3]=arr[1]+arr[2]

        for(int x=2;x<arr.length;x++){
            arr[x]=arr[x-1]+arr[x-2];
            System.out.println("兔子数为："+arr[x]);
        }
            // 
        
    }
}

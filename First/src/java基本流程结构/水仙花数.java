package java基本流程结构;

public class 水仙花数 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=999;i++)
        {
           int ge=i%10;
           int shi=i/10%10;
           int bai=i/10/10;
           if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
           {
               count++;
               System.out.println("此数为为水仙花数："+i);
           }

        }
        System.out.println("count数:"+count);
    }
 
    
}

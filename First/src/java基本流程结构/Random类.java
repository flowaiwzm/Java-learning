package java基本流程结构;
import java.util.Random;

public class Random类 {
    public static void main(String[] args) {
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            int number=r.nextInt(10);
            System.out.println("number="+number);
        }
        int x=r.nextInt(100)+1;
        System.out.println("x="+x); 
    }
    
}

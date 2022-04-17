// package java基本流程结构;
import java.util.Random;
import java.util.Scanner;
public class Random类 {
    public static void main(String[] args) {
        Random r=new Random();
        // for(int i=0;i<10;i++)
        // {
        //     int number=r.nextInt(10);
        //     System.out.println("number="+number);
        // }
        int x=r.nextInt(10)+1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
        int num=sc.nextInt();
        if(num<x){
            System.out.println("sb");
        }
        else if(num>x){
            System.out.println("hello");
        }
        else{
            System.out.println("恭喜你找到x的值为："+x);
            break;
        }
     }
        // System.out.println("x="+x); 
    }
    
}
